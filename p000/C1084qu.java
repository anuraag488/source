package p000;

/* JADX INFO: renamed from: qu */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1084qu {

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ int f28793h = 0;

    /* JADX INFO: renamed from: a */
    public String f28794a;

    /* JADX INFO: renamed from: b */
    public int f28795b;

    /* JADX INFO: renamed from: c */
    public String f28796c;

    /* JADX INFO: renamed from: d */
    public String f28797d;

    /* JADX INFO: renamed from: e */
    public long f28798e;

    /* JADX INFO: renamed from: f */
    public long f28799f;

    /* JADX INFO: renamed from: g */
    public String f28800g;

    static {
        C1047pu c1047pu = new C1047pu();
        c1047pu.f27987f = 0L;
        byte b = (byte) (c1047pu.f27989h | 2);
        c1047pu.f27983b = 1;
        c1047pu.f27986e = 0L;
        c1047pu.f27989h = (byte) (b | 1);
        c1047pu.m9676a();
    }

    /* JADX INFO: renamed from: a */
    public final C1047pu m10124a() {
        C1047pu c1047pu = new C1047pu();
        c1047pu.f27982a = this.f28794a;
        c1047pu.f27983b = this.f28795b;
        c1047pu.f27984c = this.f28796c;
        c1047pu.f27985d = this.f28797d;
        c1047pu.f27986e = this.f28798e;
        c1047pu.f27987f = this.f28799f;
        c1047pu.f27988g = this.f28800g;
        c1047pu.f27989h = (byte) 3;
        return c1047pu;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1084qu)) {
            return false;
        }
        C1084qu c1084qu = (C1084qu) obj;
        String str = this.f28794a;
        String str2 = c1084qu.f28794a;
        if (str == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str.equals(str2)) {
            return false;
        }
        if (!d55.m4358c(this.f28795b, c1084qu.f28795b)) {
            return false;
        }
        String str3 = this.f28796c;
        String str4 = c1084qu.f28796c;
        if (str3 == null) {
            if (str4 != null) {
                return false;
            }
        } else if (!str3.equals(str4)) {
            return false;
        }
        String str5 = this.f28797d;
        String str6 = c1084qu.f28797d;
        if (str5 == null) {
            if (str6 != null) {
                return false;
            }
        } else if (!str5.equals(str6)) {
            return false;
        }
        if (this.f28798e != c1084qu.f28798e || this.f28799f != c1084qu.f28799f) {
            return false;
        }
        String str7 = this.f28800g;
        String str8 = c1084qu.f28800g;
        if (str7 == null) {
            return str8 == null;
        }
        return str7.equals(str8);
    }

    public final int hashCode() {
        String str = this.f28794a;
        int iHashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ d55.m4376u(this.f28795b)) * 1000003;
        String str2 = this.f28796c;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f28797d;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j = this.f28798e;
        int i = (iHashCode3 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.f28799f;
        int i2 = (i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        String str4 = this.f28800g;
        return i2 ^ (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("PersistedInstallationEntry{firebaseInstallationId=");
        sb.append(this.f28794a);
        sb.append(", registrationStatus=");
        int i = this.f28795b;
        if (i == 1) {
            str = "ATTEMPT_MIGRATION";
        } else if (i == 2) {
            str = "NOT_GENERATED";
        } else if (i == 3) {
            str = "UNREGISTERED";
        } else if (i != 4) {
            str = i != 5 ? "null" : "REGISTER_ERROR";
        } else {
            str = "REGISTERED";
        }
        sb.append(str);
        sb.append(", authToken=");
        sb.append(this.f28796c);
        sb.append(", refreshToken=");
        sb.append(this.f28797d);
        sb.append(", expiresInSecs=");
        sb.append(this.f28798e);
        sb.append(", tokenCreationEpochInSecs=");
        sb.append(this.f28799f);
        sb.append(", fisError=");
        return zi4.m13623w(sb, this.f28800g, "}");
    }
}
