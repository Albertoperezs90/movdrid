# Movdrid

Movdrid te permite tener en la palma de tu mano todo el transporte público de Madrid.

## Prologo

Esta aplicación nacio con la idea de poner en funcionamiento buenas practicas y mejorar en arquitecturas orientadas al trabajo con LiveData.

## Arquitectura y Patrones

Se ha seguido el patron Clean Architecture propuesto por Uncle Bob así como MVVM y LiveData de Jetpack, se ha montado todo con corutinas para generar la asincronia necesaria para las llamadas a la API, el modelado de Clean Architecture se ha construido con los siguientes principios:

Presentation -> Domain
Data -> Domain
Domain
DI -> Presentation, Data, Domain.

De esta manera logramos que Domain sea un completo inconsciente de las capas externas, y que Presentation no sepa nada de Data así como Data de Presentation.

## Construido con...

### Common
* [Koin](https://insert-koin.io) - Kotlin dependency injection library.
* [Mockito](https://developer.android.com/training/testing/unit-testing/local-unit-tests) - Mock library.
* [Corutinas](https://github.com/Kotlin/kotlinx.coroutines/tree/master/ui/kotlinx-coroutines-android) - Kotlin coroutines.

### Presentation
* [MVVM](https://developer.android.com/topic/libraries/architecture/viewmodel) - Arquitectura usada.
* [LiveData](https://developer.android.com/topic/libraries/architecture/livedata) - Patron basado en el ciclo de vida.
* [Corutinas-Android](https://github.com/Kotlin/kotlinx.coroutines) - Kotlin coroutines.
* [Glide](https://github.com/Kotlin/kotlinx.coroutines) - Kotlin coroutines.

### Domain
* [Kotlin](https://github.com/JetBrains/kotlin) - Kotlin language.

### Data
* [Retrofit](https://github.com/Kotlin/kotlinx.coroutines/tree/master/ui/kotlinx-coroutines-android) - Kotlin coroutines.
* [Retrofit-Coroutines](https://github.com/JakeWharton/retrofit2-kotlin-coroutines-adapter) - Call adapter retrofit coroutines.
* [Room](https://developer.android.com/topic/libraries/architecture/room) - Room database.

### DI
* [Koin-ViewModel](https://insert-koin.io/docs/1.0/getting-started/android-viewmodel/) - Koin ViewModel.

## Autores

* **Alberto Pérez** - *Movdrid* - [albertops90](https://github.com/Albertoperezs90)

## Licencia

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details
