package p000;

import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class s42 {

    /* JADX INFO: renamed from: a */
    @s24("appInfo")
    public final wa2 f29876a;

    /* JADX INFO: renamed from: b */
    @s24("sdkVersion")
    public final String f29877b;

    /* JADX INFO: renamed from: c */
    @s24("gesture")
    public final String f29878c;

    /* JADX INFO: renamed from: d */
    @s24("isGamRegisteredTestDevice")
    public final boolean f29879d;

    /* JADX INFO: renamed from: e */
    @s24("isSimulator")
    public final boolean f29880e;

    /* JADX INFO: renamed from: f */
    @s24("adapters")
    public final o92 f29881f;

    /* JADX INFO: renamed from: g */
    @s24("networkExtras")
    public final String f29882g;

    /* JADX INFO: renamed from: h */
    @s24("serverData")
    public final wa2 f29883h;

    /* JADX INFO: renamed from: i */
    @s24("cld")
    public final wa2 f29884i;

    /* JADX INFO: renamed from: j */
    @s24("uiStorage")
    public final wa2 f29885j;

    /* JADX INFO: renamed from: k */
    @s24("userDisk")
    public final wa2 f29886k;

    /* JADX INFO: renamed from: l */
    @s24("openAction")
    public final String f29887l;

    /* JADX INFO: renamed from: m */
    @s24("adSlots")
    public final wa2 f29888m;

    /* JADX INFO: renamed from: n */
    @s24("applicationVolume")
    public final float f29889n;

    /* JADX INFO: renamed from: o */
    @s24("applicationMuted")
    public final boolean f29890o;

    /* JADX INFO: renamed from: p */
    @s24("maxAdContentRating")
    public final String f29891p;

    /* JADX INFO: renamed from: q */
    @s24("publisherFirstPartyIdEnabled")
    public final int f29892q;

    /* JADX INFO: renamed from: r */
    @s24("privacy")
    public final wa2 f29893r;

    /* JADX INFO: renamed from: s */
    @s24("plugin")
    public final String f29894s;

    /* JADX INFO: renamed from: t */
    @s24("internalSdkVersion")
    public final String f29895t;

    /* JADX INFO: renamed from: u */
    @s24("decagonVersion")
    public final String f29896u;

    /* JADX INFO: renamed from: v */
    @s24("platform")
    public final String f29897v = "ANDROID";

    /* JADX INFO: renamed from: w */
    @s24("osVersion")
    public final String f29898w = Build.VERSION.RELEASE;

    public s42(wa2 wa2Var, String str, String str2, boolean z, boolean z2, o92 o92Var, String str3, wa2 wa2Var2, wa2 wa2Var3, wa2 wa2Var4, wa2 wa2Var5, String str4, wa2 wa2Var6, float f, boolean z3, String str5, int i, wa2 wa2Var7, String str6) {
        this.f29876a = wa2Var;
        this.f29877b = str;
        this.f29878c = str2;
        this.f29879d = z;
        this.f29880e = z2;
        this.f29881f = o92Var;
        this.f29882g = str3;
        this.f29883h = wa2Var2;
        this.f29884i = wa2Var3;
        this.f29885j = wa2Var4;
        this.f29886k = wa2Var5;
        this.f29887l = str4;
        this.f29888m = wa2Var6;
        this.f29889n = f;
        this.f29890o = z3;
        this.f29891p = str5;
        this.f29892q = i;
        this.f29893r = wa2Var7;
        this.f29894s = str6;
        this.f29895t = str;
        this.f29896u = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s42)) {
            return false;
        }
        s42 s42Var = (s42) obj;
        return z62.m13387o(this.f29876a, s42Var.f29876a) && z62.m13387o(this.f29877b, s42Var.f29877b) && z62.m13387o(this.f29878c, s42Var.f29878c) && this.f29879d == s42Var.f29879d && this.f29880e == s42Var.f29880e && z62.m13387o(this.f29881f, s42Var.f29881f) && z62.m13387o(this.f29882g, s42Var.f29882g) && z62.m13387o(this.f29883h, s42Var.f29883h) && z62.m13387o(this.f29884i, s42Var.f29884i) && z62.m13387o(this.f29885j, s42Var.f29885j) && z62.m13387o(this.f29886k, s42Var.f29886k) && z62.m13387o(this.f29887l, s42Var.f29887l) && z62.m13387o(this.f29888m, s42Var.f29888m) && Float.compare(this.f29889n, s42Var.f29889n) == 0 && this.f29890o == s42Var.f29890o && z62.m13387o(this.f29891p, s42Var.f29891p) && this.f29892q == s42Var.f29892q && z62.m13387o(this.f29893r, s42Var.f29893r) && z62.m13387o(this.f29894s, s42Var.f29894s);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8, types: [int] */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v5, types: [int] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v2 */
    public final int hashCode() {
        int iM7712i = kx5.m7712i(kx5.m7712i(this.f29876a.f33192a.hashCode() * 31, this.f29877b), this.f29878c);
        boolean z = this.f29879d;
        ?? r2 = z;
        if (z) {
            r2 = 1;
        }
        int i = (iM7712i + r2) * 31;
        boolean z2 = this.f29880e;
        ?? r3 = z2;
        if (z2) {
            r3 = 1;
        }
        int iM3874f = c75.m3874f(this.f29889n, se0.m10716d(this.f29888m, kx5.m7712i(se0.m10716d(this.f29886k, se0.m10716d(this.f29885j, se0.m10716d(this.f29884i, se0.m10716d(this.f29883h, kx5.m7712i((this.f29881f.f26491a.hashCode() + ((i + r3) * 31)) * 31, this.f29882g))))), this.f29887l)), 31);
        boolean z3 = this.f29890o;
        return this.f29894s.hashCode() + se0.m10716d(this.f29893r, zc6.m13526k(this.f29892q, kx5.m7712i((iM3874f + (z3 ? 1 : z3)) * 31, this.f29891p)));
    }

    public final String toString() {
        wa2 wa2Var = this.f29876a;
        String str = this.f29877b;
        String str2 = this.f29878c;
        boolean z = this.f29879d;
        boolean z2 = this.f29880e;
        o92 o92Var = this.f29881f;
        String str3 = this.f29882g;
        wa2 wa2Var2 = this.f29883h;
        wa2 wa2Var3 = this.f29884i;
        wa2 wa2Var4 = this.f29885j;
        wa2 wa2Var5 = this.f29886k;
        String str4 = this.f29887l;
        wa2 wa2Var6 = this.f29888m;
        float f = this.f29889n;
        boolean z3 = this.f29890o;
        String str5 = this.f29891p;
        int i = this.f29892q;
        wa2 wa2Var7 = this.f29893r;
        String str6 = this.f29894s;
        StringBuilder sb = new StringBuilder("InspectorData(appInfo=");
        sb.append(wa2Var);
        sb.append(", sdkVersion=");
        sb.append(str);
        sb.append(", gesture=");
        sb.append(str2);
        sb.append(", isGamRegisteredTestDevice=");
        sb.append(z);
        sb.append(", isSimulator=");
        sb.append(z2);
        sb.append(", adapterData=");
        sb.append(o92Var);
        sb.append(", networkExtras=");
        sb.append(str3);
        sb.append(", serverData=");
        sb.append(wa2Var2);
        sb.append(", cldData=");
        sb.append(wa2Var3);
        sb.append(", uiStorage=");
        sb.append(wa2Var4);
        sb.append(", userStorage=");
        sb.append(wa2Var5);
        sb.append(", openAction=");
        sb.append(str4);
        sb.append(", adSlotData=");
        sb.append(wa2Var6);
        sb.append(", applicationVolume=");
        sb.append(f);
        sb.append(", applicationMuted=");
        sb.append(z3);
        sb.append(", maxAdContentRating=");
        sb.append(str5);
        sb.append(", publisherFirstPartyIdEnabled=");
        sb.append(i);
        sb.append(", privacy=");
        sb.append(wa2Var7);
        sb.append(", plugin=");
        return zi4.m13623w(sb, str6, ")");
    }
}
