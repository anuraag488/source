package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: cu */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0551cu extends nc1 {

    /* JADX INFO: renamed from: a */
    public byte[] f16477a;

    /* JADX INFO: renamed from: b */
    public byte[] f16478b;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof nc1) {
            nc1 nc1Var = (nc1) obj;
            boolean z = nc1Var instanceof C0551cu;
            C0551cu c0551cu = (C0551cu) nc1Var;
            if (Arrays.equals(this.f16477a, z ? c0551cu.f16477a : c0551cu.f16477a)) {
                C0551cu c0551cu2 = (C0551cu) nc1Var;
                if (Arrays.equals(this.f16478b, z ? c0551cu2.f16478b : c0551cu2.f16478b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f16478b) ^ ((Arrays.hashCode(this.f16477a) ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "ExperimentIds{clearBlob=" + Arrays.toString(this.f16477a) + ", encryptedBlob=" + Arrays.toString(this.f16478b) + "}";
    }
}
