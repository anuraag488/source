package p000;

import java.lang.invoke.VarHandle;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class p92 implements g24 {

    /* JADX INFO: renamed from: b */
    public static final p92 f27465b;

    /* JADX INFO: renamed from: c */
    public static final String f27466c;

    /* JADX INFO: renamed from: a */
    public /* synthetic */ C0498bo f27467a;

    static {
        p92 p92Var = new p92();
        ea2 ea2Var = ea2.f17925a;
        p92Var.f27467a = new C0498bo(ea2.f17926b);
        VarHandle.storeStoreFence();
        f27465b = p92Var;
        f27466c = "kotlinx.serialization.json.JsonArray";
    }

    @Override // p000.g24
    /* JADX INFO: renamed from: a */
    public final int mo4430a(String str) {
        return this.f27467a.mo4430a(str);
    }

    @Override // p000.g24
    /* JADX INFO: renamed from: b */
    public final String mo3641b() {
        return f27466c;
    }

    @Override // p000.g24
    /* JADX INFO: renamed from: c */
    public final zc6 mo4431c() {
        this.f27467a.getClass();
        return rd4.f29189k;
    }

    @Override // p000.g24
    /* JADX INFO: renamed from: d */
    public final int mo4432d() {
        this.f27467a.getClass();
        return 1;
    }

    @Override // p000.g24
    /* JADX INFO: renamed from: e */
    public final String mo4433e(int i) {
        return this.f27467a.mo4433e(i);
    }

    @Override // p000.g24
    /* JADX INFO: renamed from: f */
    public final boolean mo5886f() {
        this.f27467a.getClass();
        return false;
    }

    @Override // p000.g24
    public final List getAnnotations() {
        this.f27467a.getClass();
        return v71.f32439a;
    }

    @Override // p000.g24
    /* JADX INFO: renamed from: h */
    public final boolean mo5887h() {
        this.f27467a.getClass();
        return false;
    }

    @Override // p000.g24
    /* JADX INFO: renamed from: i */
    public final List mo4435i(int i) {
        this.f27467a.mo4435i(i);
        return v71.f32439a;
    }

    @Override // p000.g24
    /* JADX INFO: renamed from: j */
    public final g24 mo4436j(int i) {
        return this.f27467a.mo4436j(i);
    }

    @Override // p000.g24
    /* JADX INFO: renamed from: k */
    public final boolean mo4437k(int i) {
        this.f27467a.mo4437k(i);
        return false;
    }
}
