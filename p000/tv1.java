package p000;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class tv1 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f31466a;

    public tv1(byte b) {
        switch (b) {
            case 1:
                this.f31466a = new ArrayList(32);
                break;
            default:
                this.f31466a = new ArrayList(20);
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m11165a(String str, String str2) {
        ArrayList arrayList = this.f31466a;
        arrayList.add(str);
        arrayList.add(hd4.m6360z0(str2).toString());
    }

    /* JADX INFO: renamed from: b */
    public void m11166b(String str, String str2) {
        if (str.length() <= 0) {
            C1077qn.m9987m("name is empty");
            return;
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if ('!' > cCharAt || cCharAt >= 127) {
                C1077qn.m9988n(zv4.m13812g("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i), str));
                return;
            }
        }
        m11165a(str, str2);
    }

    /* JADX INFO: renamed from: c */
    public uv1 m11167c() {
        return new uv1((String[]) this.f31466a.toArray(new String[0]));
    }

    /* JADX INFO: renamed from: d */
    public void m11168d() {
        this.f31466a.add(s83.f29968c);
    }

    /* JADX INFO: renamed from: e */
    public void m11169e(float f, float f2, float f3, float f4, float f5, float f6) {
        this.f31466a.add(new t83(f, f2, f3, f4, f5, f6));
    }

    /* JADX INFO: renamed from: f */
    public void m11170f(float f, float f2, float f3, float f4, float f5, float f6) {
        this.f31466a.add(new b93(f, f2, f3, f4, f5, f6));
    }

    /* JADX INFO: renamed from: g */
    public void m11171g(float f) {
        this.f31466a.add(new u83(f));
    }

    /* JADX INFO: renamed from: h */
    public void m11172h(float f) {
        this.f31466a.add(new c93(f));
    }

    /* JADX INFO: renamed from: i */
    public void m11173i(float f, float f2) {
        this.f31466a.add(new v83(f, f2));
    }

    /* JADX INFO: renamed from: j */
    public void m11174j(float f, float f2) {
        this.f31466a.add(new d93(f, f2));
    }

    /* JADX INFO: renamed from: k */
    public void m11175k(float f, float f2) {
        this.f31466a.add(new w83(f, f2));
    }

    /* JADX INFO: renamed from: l */
    public void m11176l(float f, float f2, float f3, float f4) {
        this.f31466a.add(new y83(f, f2, f3, f4));
    }

    /* JADX INFO: renamed from: m */
    public void m11177m(float f, float f2, float f3, float f4) {
        this.f31466a.add(new g93(f, f2, f3, f4));
    }

    /* JADX INFO: renamed from: n */
    public void m11178n(String str) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f31466a;
            if (i >= arrayList.size()) {
                return;
            }
            if (str.equalsIgnoreCase((String) arrayList.get(i))) {
                arrayList.remove(i);
                arrayList.remove(i);
                i -= 2;
            }
            i += 2;
        }
    }

    /* JADX INFO: renamed from: o */
    public void m11179o(String str, String str2) {
        sj3.m10817m(str);
        sj3.m10818n(str2, str);
        m11178n(str);
        m11165a(str, str2);
    }

    /* JADX INFO: renamed from: p */
    public void m11180p(float f) {
        this.f31466a.add(new i93(f));
    }
}
