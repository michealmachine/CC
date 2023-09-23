<template>
  <div class="common-layout">
    <el-container>
      <el-header class="header">Header</el-header>
      <el-main>
        <el-card class="box-card">
          <template #header class="6">
            <div class="card-header">
              <span>12306</span>
              <el-button class="button" text>去注册</el-button>
            </div>
          </template>
          <el-form  label-width="120px">
            <el-form-item label="用户">
              <el-input  />
            </el-form-item>
            <el-form-item label="密码">
              <el-input  />
            </el-form-item>
            <el-form-item>
              <el-button @click="onsubmit" type="primary" >登入</el-button>
            </el-form-item>
          </el-form>
        </el-card>
      </el-main>
    </el-container>
  </div>
</template>
<script >
export default {
  data(){
    return{
      manager:{
      }
    }
  }
}



</script>
<style>
.header{
  background-color: #409EFF;
}
.card-header {
  display: flex;
  justify-content: space-between;
  align-items: center;
}

.text {
  font-size: 14px;
}

.item {
  margin-bottom: 18px;
}

.box-card {
  margin: auto;
  width: 480px;
  background-color: #409EFF;
}
</style>