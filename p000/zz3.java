package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class zz3 {

    /* JADX INFO: renamed from: a */
    public final byte[] f36504a;

    /* JADX INFO: renamed from: b */
    public int f36505b;

    /* JADX INFO: renamed from: c */
    public int f36506c;

    /* JADX INFO: renamed from: d */
    public boolean f36507d;

    /* JADX INFO: renamed from: e */
    public final boolean f36508e;

    /* JADX INFO: renamed from: f */
    public zz3 f36509f;

    /* JADX INFO: renamed from: g */
    public zz3 f36510g;

    public zz3() {
        this.f36504a = new byte[8192];
        this.f36508e = true;
        this.f36507d = false;
    }

    /* JADX INFO: renamed from: a */
    public final zz3 m13894a() {
        zz3 zz3Var = this.f36509f;
        zz3 zz3Var2 = zz3Var != this ? zz3Var : null;
        zz3 zz3Var3 = this.f36510g;
        zz3Var3.f36509f = zz3Var;
        this.f36509f.f36510g = zz3Var3;
        this.f36509f = null;
        this.f36510g = null;
        return zz3Var2;
    }

    /* JADX INFO: renamed from: b */
    public final void m13895b(zz3 zz3Var) {
        zz3Var.f36510g = this;
        zz3Var.f36509f = this.f36509f;
        this.f36509f.f36510g = zz3Var;
        this.f36509f = zz3Var;
    }

    /* JADX INFO: renamed from: c */
    public final zz3 m13896c() {
        this.f36507d = true;
        return new zz3(this.f36504a, this.f36505b, this.f36506c, true);
    }

    /* JADX INFO: renamed from: d */
    public final void m13897d(zz3 zz3Var, int i) {
        byte[] bArr = zz3Var.f36504a;
        if (!zz3Var.f36508e) {
            C1077qn.m9989o("only owner can write");
            return;
        }
        int i2 = zz3Var.f36506c;
        int i3 = i2 + i;
        if (i3 > 8192) {
            if (zz3Var.f36507d) {
                ds3.m4665g();
                return;
            }
            int i4 = zz3Var.f36505b;
            if (i3 - i4 > 8192) {
                ds3.m4665g();
                return;
            }
            AbstractC0990oo.m9202W(bArr, bArr, i4, i2);
            i2 = zz3Var.f36506c - zz3Var.f36505b;
            zz3Var.f36506c = i2;
            zz3Var.f36505b = 0;
        }
        int i5 = this.f36505b;
        System.arraycopy(this.f36504a, i5, bArr, i2, (i5 + i) - i5);
        zz3Var.f36506c += i;
        this.f36505b += i;
    }

    public zz3(byte[] bArr, int i, int i2, boolean z) {
        this.f36504a = bArr;
        this.f36505b = i;
        this.f36506c = i2;
        this.f36507d = z;
        this.f36508e = false;
    }
}
