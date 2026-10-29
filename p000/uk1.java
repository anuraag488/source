package p000;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class uk1 implements ti1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f31946a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ ArrayList f31947b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ sw2 f31948c;

    @Override // p000.ti1
    public final Object emit(Object obj, wm0 wm0Var) {
        byte b = this.f31946a;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                c62 c62Var = (c62) obj;
                ArrayList arrayList = this.f31947b;
                if (c62Var instanceof rk1) {
                    arrayList.add(c62Var);
                } else if (c62Var instanceof sk1) {
                    arrayList.remove(((sk1) c62Var).f30352a);
                }
                this.f31948c.setValue(Boolean.valueOf(!arrayList.isEmpty()));
                break;
            default:
                c62 c62Var2 = (c62) obj;
                ArrayList arrayList2 = this.f31947b;
                if (c62Var2 instanceof ff3) {
                    arrayList2.add(c62Var2);
                } else if (c62Var2 instanceof gf3) {
                    arrayList2.remove(((gf3) c62Var2).f19768a);
                } else if (c62Var2 instanceof ef3) {
                    arrayList2.remove(((ef3) c62Var2).f18051a);
                }
                this.f31948c.setValue(Boolean.valueOf(!arrayList2.isEmpty()));
                break;
        }
        return ju4Var;
    }
}
