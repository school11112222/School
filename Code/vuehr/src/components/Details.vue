<template>
  <div>
    <h1>用户：{{user.name}}</h1>
     <h1>权限：{{user.roles.find(index=>(index.id=2)).nameZh}}</h1>
     <h1>电话：{{user.phone}}</h1>
     <h1>固话：{{user.telephone}}</h1>
     <h1>地址：{{user.address}}</h1>
  </div>
</template>
<script>
  export default{
   
   
    computed: {
      user(){
        return this.$store.state.user;
      }
      
    }
  }
</script>
