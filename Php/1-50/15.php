<?php

    const mod = 1e9 + 7;

    function binpow($a, $n) {
        if ($n == 0) return 1;
        if ($n % 2 == 0) {
            $x = binpow($a, $n / 2);
            return (1 * $x * $x) % mod;
        }
        return (1 * $a * binpow($a, $n - 1)) % mod;
    }

    $nk = explode(" ", readline());
    $n = intval($nk[0]);
    $k = intval($nk[1]);

    $a = binpow($k, $n) - 1;
    $b = $k - 1;

    $result = (1 * $a * binpow($b, mod - 2)) % mod;
    echo $result;

?>
