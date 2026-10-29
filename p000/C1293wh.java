package p000;

import android.os.Parcelable;
import android.util.SparseArray;

/* JADX INFO: renamed from: wh */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1293wh implements wp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f33371a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ gy4 f33372b;

    public /* synthetic */ C1293wh(byte b) {
        this.f33371a = b;
    }

    @Override // p000.wp1
    public final Object invoke() {
        byte b = this.f33371a;
        ju4 ju4Var = ju4.f22634a;
        gy4 gy4Var = this.f33372b;
        switch (b) {
            case 0:
                AbstractC0492bi.m3598h(gy4Var);
                return ju4Var;
            case 1:
                gy4Var.f15309z.m12251D();
                return ju4Var;
            case 2:
                SparseArray<Parcelable> sparseArray = new SparseArray<>();
                gy4Var.f20194B.saveHierarchyState(sparseArray);
                return sparseArray;
            case 3:
                gy4.m6196i(gy4Var);
                return ju4Var;
            case 4:
                gy4Var.f20198F.invoke(gy4Var.f20194B);
                return ju4Var;
            default:
                gy4Var.f20197E.invoke(gy4Var.f20194B);
                return ju4Var;
        }
    }
}
