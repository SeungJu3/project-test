<template>

    <v-card outlined>
        <v-card-title>
            History # {{$route.params.id }}
        </v-card-title>

        <v-card-text>
            <div>
                <String label="CompNo" v-model="item.compNo" :editMode="editMode" @change="change" />
            </div>
            <div>
                <String label="CompName" v-model="item.compName" :editMode="editMode" @change="change" />
            </div>
            <div>
                <String label="Product" v-model="item.product" :editMode="editMode" @change="change" />
            </div>
            <div>
                <Number label="TotPrice" v-model="item.totPrice" :editMode="editMode" @change="change" />
            </div>
            <div>
                <String label="Request" v-model="item.request" :editMode="editMode" @change="change" />
            </div>
            <div>
                <Date label="EnrolDate" v-model="item.enrolDate" :editMode="editMode" @change="change" />
            </div>
            <div>
                <String label="Cateogry" v-model="item.cateogry" :editMode="editMode" @change="change" />
            </div>
            <div>
                <String label="SubCategory" v-model="item.subCategory" :editMode="editMode" @change="change" />
            </div>
            <div>
                <String label="CustomerFeedback" v-model="item.customerFeedback" :editMode="editMode" @change="change" />
            </div>
            <div>
                <String label="ManagerReport" v-model="item.managerReport" :editMode="editMode" @change="change" />
            </div>
        </v-card-text>
    </v-card>

</template>

<script>
  const axios = require('axios').default;

  export default {
    name: 'HistoryViewDetail',
    props: {
      value: Object,
    },
    data: () => ({
        item : [],
    }),
    async created() {
      var params = this.$route.params;
      var temp = await axios.get(axios.fixUrl('/histories/' + params.id))

      this.item = temp.data;

    },
    methods: {
    }
  }
</script>

