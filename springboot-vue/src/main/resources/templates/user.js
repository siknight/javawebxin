new Vue({
   el:"#userApp",
   data:{
       user: {id:"",username:"",password:"",email:"",sex:"",age:""},
        userList:[]
   },
    methods:{
       findAll:function () {
           var _this=this;
           axios.get('/user/findAll.do')
               .then(function (response) {
                   var data = response.data;
                   _this.userList=data;
                   // console.log(response);
               })
               .catch(function (error) {
                   // handle error
                   console.log(error);
               })
               .finally(function () {
                   // always executed
               });
       },
        findById: function (userid) {
           var _this=this;
            axios.get('/user/findById.do',{
                    params: {
                        id: userid
                    }
                }
            )
                .then(function (response) {

                    var data = response.data;
                    _this.user=data;

                    $('#myModal').modal("show");
                    // console.log(response);
                })
                .catch(function (error) {
                    // handle error
                    console.log(error);
                })
                .finally(function () {
                    // always executed
                });
        },
        update: function () {
            var _this=this;
            axios.post('/user/update.do',_this.user
            )
                .then(function (response) {
                    _this.findAll();
                    console.log(response);
                })
                .catch(function (error) {
                    console.log(error);
                });
        }
     },
   created(){
       this.findAll();
   }
});

