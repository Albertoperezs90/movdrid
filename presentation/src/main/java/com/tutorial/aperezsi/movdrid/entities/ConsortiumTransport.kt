package com.tutorial.aperezsi.movdrid.entities

import java.io.Serializable

data class ConsortiumTransport(var consortium: MutableList<ConsortiumModel>) : Serializable
data class ConsortiumModel(val buses: MutableList<BusModel>, val subWay: MutableList<SubwayModel>, val subUrban: MutableList<SubUrbanModel>)
data class BusModel(val id: String)
data class SubwayModel(val id: String)
data class SubUrbanModel(val id: String)