package p000;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ee6 extends dp5 {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ byte f18037c;

    /* JADX INFO: renamed from: d */
    public Object f18038d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ee6(dj6 dj6Var, yg3 yg3Var) {
        super("getValue");
        this.f18037c = (byte) 1;
        this.f18038d = yg3Var;
    }

    @Override // p000.dp5
    /* JADX INFO: renamed from: f */
    public final aq5 mo4517f(r36 r36Var, List list) {
        TreeMap treeMap;
        byte b = this.f18037c;
        String str = this.f17271a;
        vq5 vq5Var = aq5.f14781np;
        String str2 = null;
        switch (b) {
            case 0:
                w76.m12154a(str, 3, list);
                String strMo3117h = ((yg3) r36Var.f28986b).m13122t(r36Var, (aq5) list.get(0)).mo3117h();
                aq5 aq5Var = (aq5) list.get(1);
                yg3 yg3Var = (yg3) r36Var.f28986b;
                long jM12163j = (long) w76.m12163j(yg3Var.m13122t(r36Var, aq5Var).mo3119m().doubleValue());
                aq5 aq5VarM13122t = yg3Var.m13122t(r36Var, (aq5) list.get(2));
                HashMap mapM12165l = aq5VarM13122t instanceof mp5 ? w76.m12165l((mp5) aq5VarM13122t) : new HashMap();
                tt2 tt2Var = (tt2) this.f18038d;
                tt2Var.getClass();
                HashMap map = new HashMap();
                for (String str3 : mapM12165l.keySet()) {
                    HashMap map2 = ((en5) tt2Var.f31428b).f18281c;
                    map.put(str3, en5.m5209b(str3, map2.containsKey(str3) ? map2.get(str3) : null, mapM12165l.get(str3)));
                }
                ((ArrayList) tt2Var.f31430d).add(new en5(strMo3117h, jM12163j, map));
                return vq5Var;
            case 1:
                w76.m12154a("getValue", 2, list);
                aq5 aq5VarM13122t2 = ((yg3) r36Var.f28986b).m13122t(r36Var, (aq5) list.get(0));
                aq5 aq5VarM13122t3 = ((yg3) r36Var.f28986b).m13122t(r36Var, (aq5) list.get(1));
                String strMo3117h2 = aq5VarM13122t2.mo3117h();
                yg3 yg3Var2 = (yg3) this.f18038d;
                Map map3 = (Map) ((n96) yg3Var2.f35216c).f25581h.get((String) yg3Var2.f35215b);
                if (map3 != null && map3.containsKey(strMo3117h2)) {
                    str2 = (String) map3.get(strMo3117h2);
                }
                return str2 != null ? new sq5(str2) : aq5VarM13122t3;
            case 2:
                return vq5Var;
            case 3:
                try {
                    return it5.m6931a(((g96) this.f18038d).call());
                } catch (Exception unused) {
                    return vq5Var;
                }
            default:
                w76.m12154a(str, 3, list);
                ((yg3) r36Var.f28986b).m13122t(r36Var, (aq5) list.get(0)).mo3117h();
                aq5 aq5Var2 = (aq5) list.get(1);
                yg3 yg3Var3 = (yg3) r36Var.f28986b;
                aq5 aq5VarM13122t4 = yg3Var3.m13122t(r36Var, aq5Var2);
                if (aq5VarM13122t4 instanceof vp5) {
                    aq5 aq5VarM13122t5 = yg3Var3.m13122t(r36Var, (aq5) list.get(2));
                    if (aq5VarM13122t5 instanceof mp5) {
                        mp5 mp5Var = (mp5) aq5VarM13122t5;
                        HashMap map4 = mp5Var.f25119a;
                        if (map4.containsKey("type")) {
                            String strMo3117h3 = mp5Var.mo4624d("type").mo3117h();
                            int iM12162i = map4.containsKey("priority") ? w76.m12162i(mp5Var.mo4624d("priority").mo3119m().doubleValue()) : 1000;
                            yg3 yg3Var4 = (yg3) this.f18038d;
                            vp5 vp5Var = (vp5) aq5VarM13122t4;
                            yg3Var4.getClass();
                            if ("create".equals(strMo3117h3)) {
                                treeMap = (TreeMap) yg3Var4.f35216c;
                            } else if ("edit".equals(strMo3117h3)) {
                                treeMap = (TreeMap) yg3Var4.f35215b;
                            } else {
                                C1077qn.m9989o("Unknown callback type: ".concat(String.valueOf(strMo3117h3)));
                            }
                            if (treeMap.containsKey(Integer.valueOf(iM12162i))) {
                                iM12162i = ((Integer) treeMap.lastKey()).intValue() + 1;
                            }
                            treeMap.put(Integer.valueOf(iM12162i), vp5Var);
                            return vq5Var;
                        }
                        C1077qn.m9987m("Undefined rule type");
                    } else {
                        C1077qn.m9987m("Invalid callback params");
                    }
                } else {
                    C1077qn.m9987m("Invalid callback type");
                }
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ee6(String str, byte b) {
        super(str);
        this.f18037c = b;
    }
}
