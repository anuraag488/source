package p000;

import java.lang.invoke.VarHandle;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class xa2 implements g24 {

    /* JADX INFO: renamed from: b */
    public static final xa2 f34097b;

    /* JADX INFO: renamed from: c */
    public static final String f34098c;

    /* JADX INFO: renamed from: a */
    public /* synthetic */ kl2 f34099a;

    static {
        xa2 xa2Var = new xa2();
        xa2Var.f34099a = new ll2(fd4.f18924a, ea2.f17925a).f24125c;
        VarHandle.storeStoreFence();
        f34097b = xa2Var;
        f34098c = "kotlinx.serialization.json.JsonObject";
    }

    @Override // p000.g24
    /* JADX INFO: renamed from: a */
    public final int mo4430a(String str) {
        return this.f34099a.mo4430a(str);
    }

    @Override // p000.g24
    /* JADX INFO: renamed from: b */
    public final String mo3641b() {
        return f34098c;
    }

    @Override // p000.g24
    /* JADX INFO: renamed from: c */
    public final zc6 mo4431c() {
        this.f34099a.getClass();
        return rd4.f29190l;
    }

    @Override // p000.g24
    /* JADX INFO: renamed from: d */
    public final int mo4432d() {
        this.f34099a.getClass();
        return 2;
    }

    @Override // p000.g24
    /* JADX INFO: renamed from: e */
    public final String mo4433e(int i) {
        return this.f34099a.mo4433e(i);
    }

    @Override // p000.g24
    /* JADX INFO: renamed from: f */
    public final boolean mo5886f() {
        this.f34099a.getClass();
        return false;
    }

    @Override // p000.g24
    public final List getAnnotations() {
        this.f34099a.getClass();
        return v71.f32439a;
    }

    @Override // p000.g24
    /* JADX INFO: renamed from: h */
    public final boolean mo5887h() {
        this.f34099a.getClass();
        return false;
    }

    @Override // p000.g24
    /* JADX INFO: renamed from: i */
    public final List mo4435i(int i) {
        this.f34099a.mo4435i(i);
        return v71.f32439a;
    }

    @Override // p000.g24
    /* JADX INFO: renamed from: j */
    public final g24 mo4436j(int i) {
        return this.f34099a.mo4436j(i);
    }

    @Override // p000.g24
    /* JADX INFO: renamed from: k */
    public final boolean mo4437k(int i) {
        this.f34099a.mo4437k(i);
        return false;
    }
}
