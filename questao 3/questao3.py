import time
faturamentoDiario = [
    1200, 1500, 0, 0, 1800, 1900, 0, 2000, 2100, 0, 0, 1750, 1600,
]
startTime = time.time()

faturamentoValido = [valor for valor in faturamentoDiario if valor > 0]

menorFaturamento = min(faturamentoValido)
maiorFaturamento = max(faturamentoDiario)
mediaFaturamento = sum(faturamentoValido) / len(faturamentoValido)
diasAcimaDaMedia = sum(1 for valor in faturamentoValido if valor > mediaFaturamento)
endTime = time.time()
print(f"Menor valor de faturamento: R$ {menorFaturamento}")
print(f"Maior valor de faturamento: R$ {maiorFaturamento}")
print(f"Número de dias com faturamento acima da média: {diasAcimaDaMedia}")

executionTime = startTime - endTime
print(f"Tempo de execução: {executionTime:.6f} segundos")