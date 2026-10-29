package p000;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zu2 implements wp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f36382a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ C1122rv f36383b;

    public /* synthetic */ zu2(byte b) {
        this.f36382a = b;
    }

    @Override // p000.wp1
    public final Object invoke() {
        byte b = this.f36382a;
        Object obj = null;
        int i = 1;
        C1122rv c1122rv = this.f36383b;
        switch (b) {
            case 0:
                ArrayList arrayList = (ArrayList) c1122rv.f29655f;
                if (!arrayList.isEmpty()) {
                    Object obj2 = arrayList.get(0);
                    float fMo2950a = ((o73) obj2).f26411a.mo2950a();
                    int iM7689T = kx5.m7689T(arrayList);
                    if (1 <= iM7689T) {
                        while (true) {
                            Object obj3 = arrayList.get(i);
                            float fMo2950a2 = ((o73) obj3).f26411a.mo2950a();
                            if (Float.compare(fMo2950a, fMo2950a2) < 0) {
                                obj2 = obj3;
                                fMo2950a = fMo2950a2;
                            }
                            if (i != iM7689T) {
                                i++;
                            }
                        }
                    }
                    obj = obj2;
                }
                o73 o73Var = (o73) obj;
                return Float.valueOf(o73Var != null ? o73Var.f26411a.mo2950a() : 0.0f);
            default:
                ArrayList arrayList2 = (ArrayList) c1122rv.f29655f;
                if (!arrayList2.isEmpty()) {
                    Object obj4 = arrayList2.get(0);
                    float fM6791b = ((o73) obj4).f26411a.f14424h.m6791b();
                    int iM7689T2 = kx5.m7689T(arrayList2);
                    if (1 <= iM7689T2) {
                        while (true) {
                            Object obj5 = arrayList2.get(i);
                            float fM6791b2 = ((o73) obj5).f26411a.f14424h.m6791b();
                            if (Float.compare(fM6791b, fM6791b2) < 0) {
                                obj4 = obj5;
                                fM6791b = fM6791b2;
                            }
                            if (i != iM7689T2) {
                                i++;
                            }
                        }
                    }
                    obj = obj4;
                }
                o73 o73Var2 = (o73) obj;
                return Float.valueOf(o73Var2 != null ? o73Var2.f26411a.f14424h.m6791b() : 0.0f);
        }
    }
}
