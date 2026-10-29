package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: renamed from: vt */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1268vt {

    /* JADX INFO: renamed from: a */
    public int f32845a;

    /* JADX INFO: renamed from: b */
    public String f32846b;

    /* JADX INFO: renamed from: c */
    public String f32847c;

    /* JADX INFO: renamed from: d */
    public boolean f32848d;

    /* JADX INFO: renamed from: e */
    public byte f32849e;

    /* JADX INFO: renamed from: a */
    public final C1306wt m11986a() {
        String str;
        String str2;
        if (this.f32849e == 3 && (str = this.f32846b) != null && (str2 = this.f32847c) != null) {
            int i = this.f32845a;
            boolean z = this.f32848d;
            C1306wt c1306wt = new C1306wt();
            c1306wt.f33710a = i;
            c1306wt.f33711b = str;
            c1306wt.f33712c = str2;
            c1306wt.f33713d = z;
            VarHandle.storeStoreFence();
            return c1306wt;
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f32849e & 1) == 0) {
            sb.append(" platform");
        }
        if (this.f32846b == null) {
            sb.append(" version");
        }
        if (this.f32847c == null) {
            sb.append(" buildVersion");
        }
        if ((this.f32849e & 2) == 0) {
            sb.append(" jailbroken");
        }
        C1077qn.m9989o(d55.m4368m("Missing required properties:", sb));
        return null;
    }
}
