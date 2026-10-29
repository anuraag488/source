package p000;

import android.util.Log;

/* JADX INFO: renamed from: f8 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0641f8 {

    /* JADX INFO: renamed from: c */
    public static final C0641f8 f18802c;

    /* JADX INFO: renamed from: d */
    public static final C0641f8 f18803d;

    /* JADX INFO: renamed from: e */
    public static final C0641f8 f18804e;

    /* JADX INFO: renamed from: f */
    public static final C0641f8 f18805f;

    /* JADX INFO: renamed from: g */
    public static final C0641f8 f18806g;

    /* JADX INFO: renamed from: h */
    public static final C0641f8 f18807h;

    /* JADX INFO: renamed from: i */
    public static final C0641f8 f18808i;

    /* JADX INFO: renamed from: j */
    public static final C0641f8 f18809j;

    /* JADX INFO: renamed from: k */
    public static final C0641f8 f18810k;

    /* JADX INFO: renamed from: l */
    public static final C0641f8 f18811l;

    /* JADX INFO: renamed from: m */
    public static final C0641f8 f18812m;

    /* JADX INFO: renamed from: n */
    public static final C0641f8 f18813n;

    /* JADX INFO: renamed from: o */
    public static final C0641f8 f18814o;

    /* JADX INFO: renamed from: p */
    public static final C0641f8 f18815p;

    /* JADX INFO: renamed from: q */
    public static final C0641f8 f18816q;

    /* JADX INFO: renamed from: r */
    public static final C0641f8 f18817r;

    /* JADX INFO: renamed from: s */
    public static final C0641f8 f18818s;

    /* JADX INFO: renamed from: t */
    public static final C0641f8 f18819t;

    /* JADX INFO: renamed from: u */
    public static final C0641f8 f18820u;

    /* JADX INFO: renamed from: v */
    public static final C0641f8 f18821v;

    /* JADX INFO: renamed from: w */
    public static final C0641f8 f18822w;

    /* JADX INFO: renamed from: x */
    public static final C0641f8 f18823x;

    /* JADX INFO: renamed from: y */
    public static final C0641f8 f18824y;

    /* JADX INFO: renamed from: z */
    public static final C0641f8 f18825z;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f18826a;

    /* JADX INFO: renamed from: b */
    public String f18827b;

    static {
        byte b = 0;
        f18802c = new C0641f8("SHA1", b);
        f18803d = new C0641f8("SHA224", b);
        f18804e = new C0641f8("SHA256", b);
        f18805f = new C0641f8("SHA384", b);
        f18806g = new C0641f8("SHA512", b);
        byte b2 = 1;
        f18807h = new C0641f8("TINK", b2);
        f18808i = new C0641f8("CRUNCHY", b2);
        f18809j = new C0641f8("NO_PREFIX", b2);
        byte b3 = 2;
        f18810k = new C0641f8("TINK", b3);
        f18811l = new C0641f8("CRUNCHY", b3);
        f18812m = new C0641f8("NO_PREFIX", b3);
        byte b4 = 3;
        f18813n = new C0641f8("IEEE_P1363", b4);
        f18814o = new C0641f8("DER", b4);
        byte b5 = 4;
        f18815p = new C0641f8("ENABLED", b5);
        f18816q = new C0641f8("DISABLED", b5);
        f18817r = new C0641f8("DESTROYED", b5);
        byte b6 = 5;
        f18818s = new C0641f8("ASSUME_AES_GCM", b6);
        f18819t = new C0641f8("ASSUME_XCHACHA20POLY1305", b6);
        f18820u = new C0641f8("ASSUME_CHACHA20POLY1305", b6);
        f18821v = new C0641f8("ASSUME_AES_CTR_HMAC", b6);
        f18822w = new C0641f8("ASSUME_AES_EAX", b6);
        f18823x = new C0641f8("ASSUME_AES_GCM_SIV", b6);
        byte b7 = 6;
        f18824y = new C0641f8("TINK", b7);
        f18825z = new C0641f8("NO_PREFIX", b7);
    }

    public /* synthetic */ C0641f8(String str, byte b) {
        this.f18826a = b;
        this.f18827b = str;
    }

    /* JADX INFO: renamed from: a */
    public void m5613a(String str) {
        if (Log.isLoggable("PlayCore", 5)) {
            Log.w("PlayCore", this.f18827b + " : " + str);
        }
    }

    public String toString() {
        switch (this.f18826a) {
            case 0:
                return this.f18827b;
            case 1:
                return this.f18827b;
            case 2:
                return this.f18827b;
            case 3:
                return this.f18827b;
            case 4:
                return this.f18827b;
            case 5:
                return this.f18827b;
            case 6:
                return this.f18827b;
            case 7:
            default:
                return super.toString();
            case 8:
                return "<" + this.f18827b + '>';
        }
    }
}
