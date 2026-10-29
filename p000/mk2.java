package p000;

import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mk2 implements yp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f24974a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ ok2 f24975b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ lk2 f24976c;

    public /* synthetic */ mk2(byte b) {
        this.f24974a = b;
    }

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        ek2 ek2Var;
        ek2 ek2Var2;
        byte b = this.f24974a;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                ok2 ok2Var = this.f24975b;
                lk2 lk2Var = this.f24976c;
                Map.Entry entry = (Map.Entry) obj;
                kk2 kk2Var = (kk2) entry.getKey();
                nk2 nk2Var = (nk2) entry.getValue();
                while (true) {
                    fk2 fk2Var = nk2Var.f25904a;
                    fk2 fk2Var2 = ok2Var.f26810h;
                    ArrayList arrayList = ok2Var.f26809g;
                    if (fk2Var.compareTo(fk2Var2) <= 0 || ok2Var.f26808f || !((lw2) ok2Var.f26804b.f22481b).m8128c(kk2Var)) {
                        return ju4Var;
                    }
                    ck2 ck2Var = ek2.Companion;
                    fk2 fk2Var3 = nk2Var.f25904a;
                    ck2Var.getClass();
                    int iOrdinal = fk2Var3.ordinal();
                    if (iOrdinal == 2) {
                        ek2Var = ek2.ON_DESTROY;
                    } else if (iOrdinal != 3) {
                        ek2Var = iOrdinal != 4 ? null : ek2.ON_PAUSE;
                    } else {
                        ek2Var = ek2.ON_STOP;
                    }
                    if (ek2Var == null) {
                        xd2.m12669p(nk2Var.f25904a, "no event down from ");
                        return null;
                    }
                    arrayList.add(ek2Var.m5149a());
                    nk2Var.m8790a(lk2Var, ek2Var);
                    mb0.m8264E0(arrayList);
                }
                break;
            default:
                ok2 ok2Var2 = this.f24975b;
                lk2 lk2Var2 = this.f24976c;
                Map.Entry entry2 = (Map.Entry) obj;
                kk2 kk2Var2 = (kk2) entry2.getKey();
                nk2 nk2Var2 = (nk2) entry2.getValue();
                while (true) {
                    fk2 fk2Var4 = nk2Var2.f25904a;
                    fk2 fk2Var5 = ok2Var2.f26810h;
                    ArrayList arrayList2 = ok2Var2.f26809g;
                    if (fk2Var4.compareTo(fk2Var5) >= 0 || ok2Var2.f26808f || !((lw2) ok2Var2.f26804b.f22481b).m8128c(kk2Var2)) {
                        return ju4Var;
                    }
                    arrayList2.add(nk2Var2.f25904a);
                    ck2 ck2Var2 = ek2.Companion;
                    fk2 fk2Var6 = nk2Var2.f25904a;
                    ck2Var2.getClass();
                    int iOrdinal2 = fk2Var6.ordinal();
                    if (iOrdinal2 == 1) {
                        ek2Var2 = ek2.ON_CREATE;
                    } else if (iOrdinal2 != 2) {
                        ek2Var2 = iOrdinal2 != 3 ? null : ek2.ON_RESUME;
                    } else {
                        ek2Var2 = ek2.ON_START;
                    }
                    if (ek2Var2 == null) {
                        xd2.m12669p(nk2Var2.f25904a, "no event up from ");
                        return null;
                    }
                    nk2Var2.m8790a(lk2Var2, ek2Var2);
                    mb0.m8264E0(arrayList2);
                }
                break;
        }
    }
}
