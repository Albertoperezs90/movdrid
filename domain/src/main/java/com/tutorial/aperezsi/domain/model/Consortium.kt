package com.tutorial.aperezsi.domain.model

import com.tutorial.aperezsi.domain.errors.GetBusesError
import com.tutorial.aperezsi.domain.errors.GetSubUrbansError
import com.tutorial.aperezsi.domain.errors.GetSubWaysError
import com.tutorial.aperezsi.domain.result.Either

class Consortium {
    var subways: Either<GetSubWaysError, Subway>? = null
    var subUrbans: Either<GetSubUrbansError, SubUrban>? = null
    var buses: Either<GetBusesError, Bus>? = null
}