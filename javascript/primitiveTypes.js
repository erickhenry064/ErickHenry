/* * Repertório de Tipos Primitivos em JAVASCRIPT
 * -----------------------------------------------
 * JavaScript possui 7 tipos primitivos (ECMAScript atual):
 *   - string
 *   - number
 *   - bigint
 *   - boolean
 *   - undefined
 *   - null
 *   - symbol
 *
 * Diferente de Java, JS não distingue int/float/double: existe
 * apenas "number" (ponto flutuante de 64 bits, IEEE 754).
 *
 * Para executar:
 *   node primitiveTypes.js
 */

console.log("===== REPERTÓRIO DE TIPOS PRIMITIVOS - JAVASCRIPT =====\n");

// ---------- string ----------
const tipoString = "Olá, mundo!";
console.log(`string    | valor: "${tipoString}" | typeof: ${typeof tipoString}`);

// ---------- number ----------
const tipoNumberInt = 42;
const tipoNumberFloat = 3.14159;
console.log(`number    | valor: ${tipoNumberInt} | typeof: ${typeof tipoNumberInt} (inteiro)`);
console.log(`number    | valor: ${tipoNumberFloat} | typeof: ${typeof tipoNumberFloat} (decimal)`);
console.log(`number    | Number.MAX_SAFE_INTEGER: ${Number.MAX_SAFE_INTEGER}`);

// ---------- bigint ----------
const tipoBigInt = 9007199254740993n; // note o sufixo "n"
console.log(`bigint    | valor: ${tipoBigInt} | typeof: ${typeof tipoBigInt}`);

// ---------- boolean ----------
const tipoBoolean = true;
console.log(`boolean   | valor: ${tipoBoolean} | typeof: ${typeof tipoBoolean}`);

// ---------- undefined ----------
let tipoUndefined;
console.log(`undefined | valor: ${tipoUndefined} | typeof: ${typeof tipoUndefined}`);

// ---------- null ----------
const tipoNull = null;
console.log(`null      | valor: ${tipoNull} | typeof: ${typeof tipoNull} (curiosidade: bug histórico do JS)`);

// ---------- symbol ----------
const tipoSymbol = Symbol("identificador único");
console.log(`symbol    | valor: ${tipoSymbol.toString()} | typeof: ${typeof tipoSymbol}`);

console.log("\n===== CONVERSÕES ENTRE TIPOS (coerção) =====");

// Conversão implícita
const somaComString = "5" + 3;        // "53" (concatenação)
const somaComNumero = "5" - 3;        // 2 (coerção para número)
console.log(`"5" + 3  = ${somaComString}  (typeof: ${typeof somaComString})`);
console.log(`"5" - 3  = ${somaComNumero}  (typeof: ${typeof somaComNumero})`);

// Conversão explícita
const textoParaNumero = Number("123.45");
const numeroParaTexto = String(123.45);
const numeroParaBoolean = Boolean(0); // false
console.log(`Number("123.45") = ${textoParaNumero} (${typeof textoParaNumero})`);
console.log(`String(123.45)   = "${numeroParaTexto}" (${typeof numeroParaTexto})`);
console.log(`Boolean(0)       = ${numeroParaBoolean} (${typeof numeroParaBoolean})`);
