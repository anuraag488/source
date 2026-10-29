package p000;

import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class xo3 implements Closeable {

    /* JADX INFO: renamed from: a */
    public bo3 f34494a;

    /* JADX INFO: renamed from: b */
    public wh3 f34495b;

    /* JADX INFO: renamed from: c */
    public String f34496c;

    /* JADX INFO: renamed from: d */
    public int f34497d;

    /* JADX INFO: renamed from: e */
    public av1 f34498e;

    /* JADX INFO: renamed from: f */
    public uv1 f34499f;

    /* JADX INFO: renamed from: g */
    public d12 f34500g;

    /* JADX INFO: renamed from: h */
    public xo3 f34501h;

    /* JADX INFO: renamed from: i */
    public xo3 f34502i;

    /* JADX INFO: renamed from: j */
    public xo3 f34503j;

    /* JADX INFO: renamed from: k */
    public long f34504k;

    /* JADX INFO: renamed from: l */
    public long f34505l;

    /* JADX INFO: renamed from: m */
    public g90 f34506m;

    /* JADX INFO: renamed from: n */
    public x50 f34507n;

    /* JADX INFO: renamed from: a */
    public final wo3 m12724a() {
        wo3 wo3Var = new wo3();
        wo3Var.f33549a = this.f34494a;
        wo3Var.f33550b = this.f34495b;
        wo3Var.f33551c = this.f34497d;
        wo3Var.f33552d = this.f34496c;
        wo3Var.f33553e = this.f34498e;
        wo3Var.f33554f = this.f34499f.m11659c();
        wo3Var.f33555g = this.f34500g;
        wo3Var.f33556h = this.f34501h;
        wo3Var.f33557i = this.f34502i;
        wo3Var.f33558j = this.f34503j;
        wo3Var.f33559k = this.f34504k;
        wo3Var.f33560l = this.f34505l;
        wo3Var.f33561m = this.f34506m;
        return wo3Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        d12 d12Var = this.f34500g;
        if (d12Var != null) {
            d12Var.close();
        } else {
            C1077qn.m9989o("response is not eligible for a body and must not be closed");
        }
    }

    public final String toString() {
        return "Response{protocol=" + this.f34495b + ", code=" + this.f34497d + ", message=" + this.f34496c + ", url=" + this.f34494a.f15462a + '}';
    }
}
