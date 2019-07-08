<template>
  <div>
    <el-container>
    <!--  <el-header style="padding: 0px;display:flex;justify-content:space-between;align-items: center">
        <div style="display: inline">
          <el-input
            placeholder="通过员工名搜索员工,记得回车哦..."
            clearable
            @change="keywordsChange"
            style="width: 300px;margin: 0px;padding: 0px;"
            size="mini"
            :disabled="advanceSearchViewVisible"
            @keyup.enter.native="searchEmp"
            prefix-icon="el-icon-search"
            v-model="keywords">
          </el-input>
          <el-button type="primary" size="mini" style="margin-left: 5px" icon="el-icon-search" @click="searchEmp">搜索
          </el-button>
          <el-button slot="reference" type="primary" size="mini" style="margin-left: 5px"
                     @click="showAdvanceSearchView"><i
            class="fa fa-lg" v-bind:class="[advanceSearchViewVisible ? faangledoubleup:faangledoubledown]"
            style="margin-right: 5px"></i>高级搜索
          </el-button>
        </div>
        <div style="margin-left: 5px;margin-right: 20px;display: inline">
          <el-upload
            :show-file-list="false"
            accept="application/vnd.ms-excel"
            action="/employee/basic/importEmp"
            :on-success="fileUploadSuccess"
            :on-error="fileUploadError" :disabled="fileUploadBtnText=='正在导入'"
            :before-upload="beforeFileUpload" style="display: inline">
            <el-button size="mini" type="success" :loading="fileUploadBtnText=='正在导入'"><i class="fa fa-lg fa-level-up"
                                                                                          style="margin-right: 5px"></i>{{fileUploadBtnText}}
            </el-button>
          </el-upload>
          <el-button type="success" size="mini" @click="exportEmps"><i class="fa fa-lg fa-level-down"
                                                                       style="margin-right: 5px"></i>导出数据
          </el-button>
          <el-button type="primary" size="mini" icon="el-icon-plus"
                     @click="showAddEmpView">
            添加员工
          </el-button>
        </div>
      </el-header>-->
      <el-main style="padding-left: 0px;padding-top: 0px">
        <div>
        
          <el-table
            :data="emps"
            v-loading="tableLoading"
            border
            stripe
           
            size="mini"
            style="width: 80%">
           
            <el-table-column
              prop="eid"
              label="员工编号"
              width="200">
            </el-table-column>
            <el-table-column
              prop="ecDate"
              width="250"
             
              label="奖罚日期">
            </el-table-column>
            <el-table-column
              prop="ecReason"
              label="奖罚原因"
              width="250">
            </el-table-column>
            <el-table-column
              width="150"
              prop="ecPoint"
              label="奖罚分">
  
            </el-table-column>
            <el-table-column
              prop="ecType"
              width="150"
             
              label="奖罚类别">
            </el-table-column>
            <el-table-column
              prop="remark"
              width="250"
              label="备注">
            </el-table-column>
           
          </el-table>
       
        </div>
      </el-main>
    </el-container>
    
  </div>
</template>
<script>
  export default {
    data() {
      return {
        emps: [],
        tableLoading:false,
       
    }},
    mounted: function () {
      this.loadEmps();
    },
    methods: {
    
      loadEmps(){
        this.tableLoading = true;
        var _this = this;
        this.getRequest("/personal/pop/employeeec").then(resp=> {
          _this.tableLoading = false;
          if (resp && resp.status == 200) {
            _this.emps = resp.data;
          }
        })
      },
   
     
   
    }
  };
</script>
<style>
  .el-dialog__body {
    padding-top: 0px;
    padding-bottom: 0px;
  }

  .slide-fade-enter-active {
    transition: all .8s ease;
  }

  .slide-fade-leave-active {
    transition: all .8s cubic-bezier(1.0, 0.5, 0.8, 1.0);
  }

  .slide-fade-enter, .slide-fade-leave-to {
    transform: translateX(10px);
    opacity: 0;
  }
</style>
