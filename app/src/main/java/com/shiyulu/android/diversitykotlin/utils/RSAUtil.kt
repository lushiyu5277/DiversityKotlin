package com.shiyulu.android.diversitykotlin.utils

import android.util.Log
import java.security.KeyPair
import java.security.KeyPairGenerator
import java.security.PrivateKey
import java.security.PublicKey
import java.security.interfaces.RSAPrivateKey
import java.security.interfaces.RSAPublicKey
import javax.crypto.Cipher

val TAG = "RSAUtil"

fun generateRSAKeyPair(): KeyPair {
    return generateRSAKeyPair(1024)
}

fun generateRSAKeyPair(keyLength: Int): KeyPair {
    val kpg = KeyPairGenerator.getInstance("RSA")
    kpg.initialize(keyLength)
    return kpg.generateKeyPair()
}

fun encryptData(data: ByteArray, publicKey: PublicKey): ByteArray? {
    val cipher = Cipher.getInstance("RSA")
    cipher.init(Cipher.ENCRYPT_MODE, publicKey)
    return cipher.doFinal(data)
}

fun printPublicKeyInfo(publicKey: PublicKey) {
    val rsaPublicKey = publicKey as RSAPublicKey
    Log.d(TAG, "----------RSAPublicKey----------")
    Log.d(TAG, "Modulus.length=" + rsaPublicKey.modulus.bitLength())
    Log.d(TAG, "Modulus=" + rsaPublicKey.modulus.toString())
    Log.d(TAG, "PublicExponent.length=" + rsaPublicKey.publicExponent.bitLength())
    Log.d(TAG, "PublicExponent=" + rsaPublicKey.publicExponent.toString())
}

fun printPrivateKeyInfo(privateKey: PrivateKey) {
    var rsaPrivateKey = privateKey as RSAPrivateKey
    Log.d(TAG, "----------RSAPrivateKey ----------")
    Log.d(TAG, "Modulus.length=" + rsaPrivateKey.modulus.bitLength())
    Log.d(TAG, "Modulus=" + rsaPrivateKey.modulus.toString())
    Log.d(TAG, "PrivateExponent.length=" + rsaPrivateKey.privateExponent.bitLength())
    Log.d(TAG, "PrivateExponent=" + rsaPrivateKey.privateExponent.toString())
}