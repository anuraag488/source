package p000;

import android.content.Intent;

/* JADX INFO: renamed from: qh */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1071qh implements wp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f28460a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ xz4 f28461b;

    public /* synthetic */ C1071qh(byte b) {
        this.f28460a = b;
    }

    @Override // p000.wp1
    public final Object invoke() {
        Intent intent;
        byte b = this.f28460a;
        xz4 xz4Var = this.f28461b;
        switch (b) {
            case 0:
                return xz4Var.m12798a();
            case 1:
                return xz4Var.m12798a();
            case 2:
                return xz4Var.m12798a();
            case 3:
                return xz4Var.m12798a();
            case 4:
                return Boolean.valueOf(xz4Var.m12798a() == null);
            case 5:
                return xz4Var.m12798a();
            default:
                ag0 ag0VarM12798a = xz4Var.m12798a();
                if (ag0VarM12798a == null || (intent = ag0VarM12798a.getIntent()) == null) {
                    return null;
                }
                return Integer.valueOf(intent.getIntExtra("host_id", -1));
        }
    }
}
