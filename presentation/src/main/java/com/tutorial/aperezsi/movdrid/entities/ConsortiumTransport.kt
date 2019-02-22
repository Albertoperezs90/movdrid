package com.tutorial.aperezsi.movdrid.entities

import java.io.Serializable

data class ConsortiumTransport(var consortium: MutableList<Consortium>) : Serializable
data class Consortium(val id: Int) : Serializable