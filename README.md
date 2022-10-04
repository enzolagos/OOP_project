# OOP Project
###### Team 3: Julian Barbieri, Enzo Lagos
### Tareas a realizar
    - Crear un repositorio github
 
    - master debe estar protegido - PR

    - branch por persona/funcionalidad

    - Jira

    - analizar el problema

    - desarrollando

    - testeando

__ __
### Enunciado:

Se tiene un manejador de test cases completo donde se necesitan varias configuraciones

Un test case tiene titulo, prioridad, descripcion, pasos (pasos tienen el paso y resultados esperado) , puede adicionar más atributos

Un conjunto de test cases es denominado un test suite (título, sprint, y se pueden agregar varios tcs)

Un test case puede ser ejecutado y se adicionan nuevos atributos como ser build, owner, bug associated y estado (PASSED, FAILED,BLOCKED)

BUG es una entidad donde tiene título, descripción, prioridad, severidad, pasos, expected and actual result.

ENHANCEMENT es una entidad parecida al bug que en lugar de expected result tiene sugerencia de resultados

Owner tiene los datos de nombre, apellido y role

QA tiene diferentes datos pero es la persona que reporta el bug

DEV tienen diferentes datos pero es la persona que es asignada a los bugs para su resolución

### Acciones


Se desea tener un método donde me muestre los test cases creados por un específico QA

Se desea tener un método que me muestre los bugs asignados a un específico desarrollador

Se desea tener los test cases que tienen una prioridad en específico

Se desea tener los bugs que tienen una severidad específica

Se desea tener la cantidad de failed/passed/blocked de un test suite