package p000;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yq3 implements yp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f35461a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ ArrayList f35462b;

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        byte b = this.f35461a;
        ju4 ju4Var = ju4.f22634a;
        ArrayList arrayList = this.f35462b;
        cb3 cb3Var = (cb3) obj;
        switch (b) {
            case 0:
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    cb3.m3945s(cb3Var, (db3) arrayList.get(i), 0, 0);
                }
                break;
            default:
                int size2 = arrayList.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    cb3Var.m3952k((db3) arrayList.get(i2), 0, 0, 0.0f);
                }
                break;
        }
        return ju4Var;
    }
}
