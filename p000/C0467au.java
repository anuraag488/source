package p000;

import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: renamed from: au */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0467au {

    /* JADX INFO: renamed from: a */
    public String f14865a;

    /* JADX INFO: renamed from: b */
    public Integer f14866b;

    /* JADX INFO: renamed from: c */
    public f81 f14867c;

    /* JADX INFO: renamed from: d */
    public long f14868d;

    /* JADX INFO: renamed from: e */
    public long f14869e;

    /* JADX INFO: renamed from: f */
    public HashMap f14870f;

    /* JADX INFO: renamed from: g */
    public Integer f14871g;

    /* JADX INFO: renamed from: h */
    public String f14872h;

    /* JADX INFO: renamed from: i */
    public byte[] f14873i;

    /* JADX INFO: renamed from: j */
    public byte[] f14874j;

    /* JADX INFO: renamed from: a */
    public final String m3308a(String str) {
        String str2 = (String) this.f14870f.get(str);
        return str2 == null ? "" : str2;
    }

    /* JADX INFO: renamed from: b */
    public final int m3309b(String str) {
        String str2 = (String) this.f14870f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    /* JADX INFO: renamed from: c */
    public final C0940nb m3310c() {
        C0940nb c0940nb = new C0940nb((byte) 1);
        String str = this.f14865a;
        if (str == null) {
            xy4.m12782k("Null transportName");
            return null;
        }
        c0940nb.f25605b = str;
        c0940nb.f25606c = this.f14866b;
        c0940nb.f25611h = this.f14871g;
        c0940nb.f25612i = this.f14872h;
        c0940nb.f25613j = this.f14873i;
        c0940nb.f25614k = this.f14874j;
        f81 f81Var = this.f14867c;
        if (f81Var == null) {
            xy4.m12782k("Null encodedPayload");
            return null;
        }
        c0940nb.f25607d = f81Var;
        c0940nb.f25608e = Long.valueOf(this.f14868d);
        c0940nb.f25609f = Long.valueOf(this.f14869e);
        c0940nb.f25610g = new HashMap(this.f14870f);
        return c0940nb;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0467au)) {
            return false;
        }
        C0467au c0467au = (C0467au) obj;
        if (!this.f14865a.equals(c0467au.f14865a)) {
            return false;
        }
        Integer num = this.f14866b;
        Integer num2 = c0467au.f14866b;
        if (num == null) {
            if (num2 != null) {
                return false;
            }
        } else if (!num.equals(num2)) {
            return false;
        }
        if (!this.f14867c.equals(c0467au.f14867c) || this.f14868d != c0467au.f14868d || this.f14869e != c0467au.f14869e || !this.f14870f.equals(c0467au.f14870f)) {
            return false;
        }
        Integer num3 = this.f14871g;
        Integer num4 = c0467au.f14871g;
        if (num3 == null) {
            if (num4 != null) {
                return false;
            }
        } else if (!num3.equals(num4)) {
            return false;
        }
        String str = this.f14872h;
        String str2 = c0467au.f14872h;
        if (str == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str.equals(str2)) {
            return false;
        }
        return Arrays.equals(this.f14873i, c0467au.f14873i) && Arrays.equals(this.f14874j, c0467au.f14874j);
    }

    public final int hashCode() {
        int iHashCode = (this.f14865a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f14866b;
        int iHashCode2 = (((iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.f14867c.hashCode()) * 1000003;
        long j = this.f14868d;
        int i = (iHashCode2 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.f14869e;
        int iHashCode3 = (((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.f14870f.hashCode()) * 1000003;
        Integer num2 = this.f14871g;
        int iHashCode4 = (iHashCode3 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
        String str = this.f14872h;
        return Arrays.hashCode(this.f14874j) ^ ((((iHashCode4 ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ Arrays.hashCode(this.f14873i)) * 1000003);
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.f14865a + ", code=" + this.f14866b + ", encodedPayload=" + this.f14867c + ", eventMillis=" + this.f14868d + ", uptimeMillis=" + this.f14869e + ", autoMetadata=" + this.f14870f + ", productId=" + this.f14871g + ", pseudonymousId=" + this.f14872h + ", experimentIdsClear=" + Arrays.toString(this.f14873i) + ", experimentIdsEncrypted=" + Arrays.toString(this.f14874j) + "}";
    }
}
