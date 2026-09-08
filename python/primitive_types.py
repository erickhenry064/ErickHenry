def imprimir_tipo(nome_tipo: str, valor, extra: str = "") -> None:
    print(f"{nome_tipo:<10} | valor: {valor!r:<25} | type(): {type(valor).__name__:<10} {extra}")


def main():
    print("===== REPERTÓRIO DE TIPOS PRIMITIVOS (BUILT-IN) - PYTHON =====\n")

    # ---------- int ----------
    tipo_int = 42
    tipo_int_grande = 99999999999999999999999999  # precisão arbitrária!
    imprimir_tipo("int", tipo_int)
    imprimir_tipo("int", tipo_int_grande, "(precisão arbitrária, sem overflow)")

    # ---------- float ----------
    tipo_float = 3.14159
    imprimir_tipo("float", tipo_float, "(equivalente ao double de 64 bits)")

    # ---------- complex ----------
    tipo_complex = 2 + 3j
    imprimir_tipo("complex", tipo_complex, f"(parte real: {tipo_complex.real}, imag: {tipo_complex.imag})")

    # ---------- bool ----------
    tipo_bool = True
    imprimir_tipo("bool", tipo_bool, "(subtipo de int: True == 1, False == 0)")

    # ---------- str ----------
    tipo_str = "Olá, mundo!"
    imprimir_tipo("str", tipo_str)

    # ---------- NoneType ----------
    tipo_none = None
    imprimir_tipo("NoneType", tipo_none, "(equivalente ao null)")

    # ---------- bytes ----------
    tipo_bytes = b"dados binarios"
    imprimir_tipo("bytes", tipo_bytes)

    print("\n===== CONVERSÕES ENTRE TIPOS (casting) =====")

    texto_numero = "123"
    numero = int(texto_numero)
    print(f'int("{texto_numero}")     = {numero} (type: {type(numero).__name__})')

    numero_float = float(numero)
    print(f'float({numero})        = {numero_float} (type: {type(numero_float).__name__})')

    numero_str = str(numero_float)
    print(f'str({numero_float})     = "{numero_str}" (type: {type(numero_str).__name__})')

    valor_bool = bool(0)
    print(f'bool(0)             = {valor_bool} (type: {type(valor_bool).__name__})')

    print("\n===== TAMANHO EM MEMÓRIA (sys.getsizeof) =====")
    import sys
    for nome, valor in [
        ("int (42)", 42),
        ("float (3.14)", 3.14),
        ("bool (True)", True),
        ("str ('abc')", "abc"),
        ("None", None),
    ]:
        print(f"{nome:<15} -> {sys.getsizeof(valor)} bytes")


if __name__ == "__main__":
    main()
