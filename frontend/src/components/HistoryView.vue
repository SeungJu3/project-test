<template>

    <v-data-table
        :headers="headers"
        :items="history"
        :items-per-page="5"
        class="elevation-1"
    ></v-data-table>

</template>

<script>
    const axios = require('axios').default;

    export default {
        name: 'HistoryView',
        props: {
            value: Object,
            editMode: Boolean,
            isNew: Boolean
        },
        data: () => ({
            headers: [
                { text: "id", value: "id" },
                { text: "compNo", value: "compNo" },
                { text: "compName", value: "compName" },
                { text: "product", value: "product" },
                { text: "totPrice", value: "totPrice" },
                { text: "request", value: "request" },
                { text: "enrolDate", value: "enrolDate" },
                { text: "cateogry", value: "cateogry" },
                { text: "subCategory", value: "subCategory" },
                { text: "customerFeedback", value: "customerFeedback" },
                { text: "managerReport", value: "managerReport" },
            ],
            history : [],
        }),
          async created() {
            var temp = await axios.get(axios.fixUrl('/histories'))

            temp.data._embedded.histories.map(obj => obj.id=obj._links.self.href.split("/")[obj._links.self.href.split("/").length - 1])

            this.history = temp.data._embedded.histories;
        },
        methods: {
        }
    }
</script>

