package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: ku */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0848ku extends kn2 {

    /* JADX INFO: renamed from: a */
    public long f23497a;

    /* JADX INFO: renamed from: b */
    public Integer f23498b;

    /* JADX INFO: renamed from: c */
    public nf0 f23499c;

    /* JADX INFO: renamed from: d */
    public long f23500d;

    /* JADX INFO: renamed from: e */
    public byte[] f23501e;

    /* JADX INFO: renamed from: f */
    public String f23502f;

    /* JADX INFO: renamed from: g */
    public long f23503g;

    /* JADX INFO: renamed from: h */
    public n03 f23504h;

    /* JADX INFO: renamed from: i */
    public nc1 f23505i;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kn2) {
            kn2 kn2Var = (kn2) obj;
            C0848ku c0848ku = (C0848ku) kn2Var;
            if (this.f23497a == c0848ku.f23497a) {
                Integer num = this.f23498b;
                Integer num2 = c0848ku.f23498b;
                if (num != null ? num.equals(num2) : num2 == null) {
                    nf0 nf0Var = this.f23499c;
                    nf0 nf0Var2 = c0848ku.f23499c;
                    if (nf0Var != null ? nf0Var.equals(nf0Var2) : nf0Var2 == null) {
                        if (this.f23500d == c0848ku.f23500d) {
                            if (Arrays.equals(this.f23501e, kn2Var instanceof C0848ku ? ((C0848ku) kn2Var).f23501e : c0848ku.f23501e)) {
                                String str = this.f23502f;
                                String str2 = c0848ku.f23502f;
                                if (str != null ? str.equals(str2) : str2 == null) {
                                    if (this.f23503g == c0848ku.f23503g) {
                                        n03 n03Var = this.f23504h;
                                        n03 n03Var2 = c0848ku.f23504h;
                                        if (n03Var != null ? n03Var.equals(n03Var2) : n03Var2 == null) {
                                            nc1 nc1Var = this.f23505i;
                                            nc1 nc1Var2 = c0848ku.f23505i;
                                            if (nc1Var != null ? nc1Var.equals(nc1Var2) : nc1Var2 == null) {
                                                return true;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f23497a;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f23498b;
        int iHashCode = (i ^ (num == null ? 0 : num.hashCode())) * 1000003;
        nf0 nf0Var = this.f23499c;
        int iHashCode2 = nf0Var == null ? 0 : nf0Var.hashCode();
        long j2 = this.f23500d;
        int iHashCode3 = (((((iHashCode ^ iHashCode2) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f23501e)) * 1000003;
        String str = this.f23502f;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        long j3 = this.f23503g;
        int i2 = (((iHashCode3 ^ iHashCode4) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003;
        n03 n03Var = this.f23504h;
        int iHashCode5 = (i2 ^ (n03Var == null ? 0 : n03Var.hashCode())) * 1000003;
        nc1 nc1Var = this.f23505i;
        return iHashCode5 ^ (nc1Var != null ? nc1Var.hashCode() : 0);
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.f23497a + ", eventCode=" + this.f23498b + ", complianceData=" + this.f23499c + ", eventUptimeMs=" + this.f23500d + ", sourceExtension=" + Arrays.toString(this.f23501e) + ", sourceExtensionJsonProto3=" + this.f23502f + ", timezoneOffsetSeconds=" + this.f23503g + ", networkConnectionInfo=" + this.f23504h + ", experimentIds=" + this.f23505i + "}";
    }
}
