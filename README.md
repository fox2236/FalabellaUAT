# FalabellaUAT
prueba de automatizacion en Katalon

Requerimientos:
- Frame de preferencia Katalon (version 7.5.5) con Eclipse, enlace rapido desde aqui: https://drive.google.com/drive/folders/13JW6tThK-615bsUN4PY1YtrWQrVrHJh7?usp=sharing
- Descargar el proyecto desde: https://github.com/fox2236/FalabellaUAT/ (acceso publico)
- Ejecutar Katalon.exe y montar el proyecto desde File -> Open Project -> [archivo ".project"] (o apuntar a carpeta contenedora del proyecto)

Ejecucion de la automatizacion:
- En el navegador de archivos izquierdo, existe la carpeta "Test Suite" y dentro, la suite "Suite FalabellaAUT" la cual esta cargada con los 5 Test Cases solicitados, para ejecutar, presionar el boton play en la barra superior.

Estructura:
- En la carpeta "Object Repository" estan los elementos que se ocuparan en la navegacion
- En la carpeta "Test Cases" estan los procedimientos que ocuparan los elementos para navegar, comparar y validar
- en la carpeta "Test Suites" esta una coleccion de Test que se ocuparan paso a paso. desde el testcase 01 hasta el 05
- Una vez terminado los Test, se generara un reporte el cual indicara el estado de los elementos, comparaciones y validaciones.
- El reporte fisico se genera en la carpeta \reports\ en formato HTML
