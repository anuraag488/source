package p000;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class wf6 extends mp5 {

    /* JADX INFO: renamed from: b */
    public tt2 f33346b;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // p000.mp5, p000.aq5
    /* JADX INFO: renamed from: q */
    public final aq5 mo3120q(String str, r36 r36Var, ArrayList arrayList) {
        tt2 tt2Var = this.f33346b;
        switch (str.hashCode()) {
            case 21624207:
                if (str.equals("getEventName")) {
                    w76.m12154a("getEventName", 0, arrayList);
                    return new sq5(((en5) tt2Var.f31429c).f18279a);
                }
                break;
            case 45521504:
                if (str.equals("getTimestamp")) {
                    w76.m12154a("getTimestamp", 0, arrayList);
                    return new xo5(Double.valueOf(((en5) tt2Var.f31429c).f18280b));
                }
                break;
            case 146575578:
                if (str.equals("getParamValue")) {
                    w76.m12154a("getParamValue", 1, arrayList);
                    String strMo3117h = ((yg3) r36Var.f28986b).m13122t(r36Var, (aq5) arrayList.get(0)).mo3117h();
                    HashMap map = ((en5) tt2Var.f31429c).f18281c;
                    return it5.m6931a(map.containsKey(strMo3117h) ? map.get(strMo3117h) : null);
                }
                break;
            case 700587132:
                if (str.equals("getParams")) {
                    w76.m12154a("getParams", 0, arrayList);
                    HashMap map2 = ((en5) tt2Var.f31429c).f18281c;
                    mp5 mp5Var = new mp5();
                    for (String str2 : map2.keySet()) {
                        mp5Var.mo4623c(str2, it5.m6931a(map2.get(str2)));
                    }
                    return mp5Var;
                }
                break;
            case 920706790:
                if (str.equals("setParamValue")) {
                    w76.m12154a("setParamValue", 2, arrayList);
                    String strMo3117h2 = ((yg3) r36Var.f28986b).m13122t(r36Var, (aq5) arrayList.get(0)).mo3117h();
                    aq5 aq5VarM13122t = ((yg3) r36Var.f28986b).m13122t(r36Var, (aq5) arrayList.get(1));
                    en5 en5Var = (en5) tt2Var.f31429c;
                    Object objM12164k = w76.m12164k(aq5VarM13122t);
                    HashMap map3 = en5Var.f18281c;
                    if (objM12164k == null) {
                        map3.remove(strMo3117h2);
                        return aq5VarM13122t;
                    }
                    map3.put(strMo3117h2, en5.m5209b(strMo3117h2, map3.get(strMo3117h2), objM12164k));
                    return aq5VarM13122t;
                }
                break;
            case 1570616835:
                if (str.equals("setEventName")) {
                    w76.m12154a("setEventName", 1, arrayList);
                    aq5 aq5VarM13122t2 = ((yg3) r36Var.f28986b).m13122t(r36Var, (aq5) arrayList.get(0));
                    if (aq5.f14781np.equals(aq5VarM13122t2) || aq5.f14782op.equals(aq5VarM13122t2)) {
                        C1077qn.m9987m("Illegal event name");
                        return null;
                    }
                    ((en5) tt2Var.f31429c).f18279a = aq5VarM13122t2.mo3117h();
                    return new sq5(aq5VarM13122t2.mo3117h());
                }
                break;
        }
        return super.mo3120q(str, r36Var, arrayList);
    }
}
