package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class f54 extends of4 implements nq1 {

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ byte f18772t = 0;

    /* JADX INFO: renamed from: u */
    public /* synthetic */ Object f18773u;

    /* JADX INFO: renamed from: v */
    public /* synthetic */ Object f18774v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f54(k84 k84Var, wp1 wp1Var, wm0 wm0Var) {
        super(3, wm0Var);
        this.f18773u = k84Var;
        this.f18774v = wp1Var;
    }

    @Override // p000.nq1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.f18772t;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                f54 f54Var = new f54(3, (wm0) obj3);
                f54Var.f18773u = (i54) obj;
                f54Var.f18774v = (hw2) obj2;
                return f54Var.invokeSuspend(ju4Var);
            default:
                ((Number) obj2).floatValue();
                new f54((k84) this.f18773u, (wp1) this.f18774v, (wm0) obj3).invokeSuspend(ju4Var);
                return ju4Var;
        }
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        switch (this.f18772t) {
            case 0:
                i54 i54Var = (i54) this.f18773u;
                hw2 hw2Var = (hw2) this.f18774v;
                ap0 ap0Var = ap0.f14763a;
                k43.m7376J(obj);
                Set setKeySet = hw2Var.m6523a().keySet();
                ArrayList arrayList = new ArrayList(ib0.m6717y0(setKeySet, 10));
                Iterator it = setKeySet.iterator();
                while (it.hasNext()) {
                    arrayList.add(((xd3) it.next()).f34170a);
                }
                Map<String, ?> all = i54Var.f21134a.getAll();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Iterator<Map.Entry<String, ?>> it2 = all.entrySet().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(fq2.m5779K(linkedHashMap.size()));
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            if (value instanceof Set) {
                                value = hb0.m6322h1((Iterable) value);
                            }
                            linkedHashMap2.put(key, value);
                        }
                        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                            if (!arrayList.contains((String) entry2.getKey())) {
                                linkedHashMap3.put(entry2.getKey(), entry2.getValue());
                            }
                        }
                        hw2 hw2Var2 = new hw2(new LinkedHashMap(hw2Var.m6523a()), false);
                        for (Map.Entry entry3 : linkedHashMap3.entrySet()) {
                            String str = (String) entry3.getKey();
                            Object value2 = entry3.getValue();
                            if (value2 instanceof Boolean) {
                                hw2Var2.m6527e(new xd3(str), value2);
                            } else if (value2 instanceof Float) {
                                hw2Var2.m6527e(new xd3(str), value2);
                            } else if (value2 instanceof Integer) {
                                hw2Var2.m6527e(new xd3(str), value2);
                            } else if (value2 instanceof Long) {
                                hw2Var2.m6527e(new xd3(str), value2);
                            } else if (value2 instanceof String) {
                                hw2Var2.m6527e(new xd3(str), value2);
                            } else if (value2 instanceof Set) {
                                hw2Var2.m6527e(new xd3(str), (Set) value2);
                            }
                        }
                        return new hw2(new LinkedHashMap(hw2Var2.m6523a()), true);
                    }
                    Map.Entry<String, ?> next = it2.next();
                    String key2 = next.getKey();
                    Set set = i54Var.f21135b;
                    if (set != null ? set.contains(key2) : true) {
                        linkedHashMap.put(next.getKey(), next.getValue());
                    }
                }
                break;
            default:
                ap0 ap0Var2 = ap0.f14763a;
                k43.m7376J(obj);
                ((k84) this.f18773u).m7427d(false);
                wp1 wp1Var = (wp1) this.f18774v;
                if (wp1Var != null) {
                    wp1Var.invoke();
                }
                return ju4.f22634a;
        }
    }

    public /* synthetic */ f54(int i, wm0 wm0Var) {
        super(i, wm0Var);
    }
}
