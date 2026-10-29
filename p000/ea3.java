package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ea3 {
    public static final da3 Companion = new da3();

    /* JADX INFO: renamed from: a */
    public String f17927a;

    /* JADX INFO: renamed from: b */
    public String f17928b;

    /* JADX INFO: renamed from: c */
    public byte[] f17929c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ea3)) {
            return false;
        }
        ea3 ea3Var = (ea3) obj;
        return z62.m13387o(this.f17927a, ea3Var.f17927a) && z62.m13387o(this.f17928b, ea3Var.f17928b) && z62.m13387o(this.f17929c, ea3Var.f17929c);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f17929c) + zi4.m13613m(this.f17927a.hashCode() * 31, this.f17928b, 31);
    }

    public final String toString() {
        String str = this.f17927a;
        String str2 = this.f17928b;
        return zi4.m13623w(zi4.m13625y("PersistedShortcut(title=", str, ", intentUri=", str2, ", iconBytes="), Arrays.toString(this.f17929c), ")");
    }
}
