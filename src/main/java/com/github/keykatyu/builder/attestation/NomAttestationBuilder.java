package com.github.keykatyu.builder.attestation;

import java.io.IOException;

public interface NomAttestationBuilder {
    DateNaissanceAttestationBuilder nom(String nom) throws IOException;
}
