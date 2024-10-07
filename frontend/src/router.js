
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import UserUserManager from "./components/listers/UserUserCards"
import UserUserDetail from "./components/listers/UserUserDetail"

import ReservationReservationManager from "./components/listers/ReservationReservationCards"
import ReservationReservationDetail from "./components/listers/ReservationReservationDetail"

import ConsultingConsultingManager from "./components/listers/ConsultingConsultingCards"
import ConsultingConsultingDetail from "./components/listers/ConsultingConsultingDetail"



import FeedbackFeedbackManager from "./components/listers/FeedbackFeedbackCards"
import FeedbackFeedbackDetail from "./components/listers/FeedbackFeedbackDetail"

import ReprotReprotManager from "./components/listers/ReprotReprotCards"
import ReprotReprotDetail from "./components/listers/ReprotReprotDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/users/users',
                name: 'UserUserManager',
                component: UserUserManager
            },
            {
                path: '/users/users/:id',
                name: 'UserUserDetail',
                component: UserUserDetail
            },

            {
                path: '/reservations/reservations',
                name: 'ReservationReservationManager',
                component: ReservationReservationManager
            },
            {
                path: '/reservations/reservations/:id',
                name: 'ReservationReservationDetail',
                component: ReservationReservationDetail
            },

            {
                path: '/consultings/consultings',
                name: 'ConsultingConsultingManager',
                component: ConsultingConsultingManager
            },
            {
                path: '/consultings/consultings/:id',
                name: 'ConsultingConsultingDetail',
                component: ConsultingConsultingDetail
            },



            {
                path: '/feedbacks/feedbacks',
                name: 'FeedbackFeedbackManager',
                component: FeedbackFeedbackManager
            },
            {
                path: '/feedbacks/feedbacks/:id',
                name: 'FeedbackFeedbackDetail',
                component: FeedbackFeedbackDetail
            },

            {
                path: '/reprots/reprots',
                name: 'ReprotReprotManager',
                component: ReprotReprotManager
            },
            {
                path: '/reprots/reprots/:id',
                name: 'ReprotReprotDetail',
                component: ReprotReprotDetail
            },



    ]
})
