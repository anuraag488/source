package p000;

import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class it5 {
    /* JADX INFO: renamed from: a */
    public static aq5 m6931a(Object obj) {
        if (obj == null) {
            return aq5.f14782op;
        }
        if (obj instanceof String) {
            return new sq5((String) obj);
        }
        if (obj instanceof Double) {
            return new xo5((Double) obj);
        }
        if (obj instanceof Long) {
            return new xo5(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new xo5(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Boolean) {
            return new jo5((Boolean) obj);
        }
        if (!(obj instanceof Map)) {
            if (!(obj instanceof List)) {
                C1077qn.m9987m("Invalid value type");
                return null;
            }
            do5 do5Var = new do5();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                do5Var.m4630v(do5Var.m4628t(), m6931a(it.next()));
            }
            return do5Var;
        }
        mp5 mp5Var = new mp5();
        Map map = (Map) obj;
        for (Object string : map.keySet()) {
            aq5 aq5VarM6931a = m6931a(map.get(string));
            if (string != null) {
                if (!(string instanceof String)) {
                    string = string.toString();
                }
                mp5Var.mo4623c((String) string, aq5VarM6931a);
            }
        }
        return mp5Var;
    }

    /* JADX INFO: renamed from: b */
    public static final gr5 m6932b(long j, Object obj) {
        gr5 gr5Var = (gr5) rx5.m10485c(j, obj);
        if (((z06) gr5Var).f35688a) {
            return gr5Var;
        }
        int size = gr5Var.size();
        wv5 wv5VarM12430b = ((wv5) gr5Var).m12430b(size == 0 ? 10 : size + size);
        rx5.m10491i(j, obj, wv5VarM12430b);
        return wv5VarM12430b;
    }

    /* JADX INFO: renamed from: c */
    public static aq5 m6933c(mc6 mc6Var) {
        if (mc6Var == null) {
            return aq5.f14781np;
        }
        int iM8283w = mc6Var.m8283w() - 1;
        if (iM8283w == 1) {
            return mc6Var.m8277q() ? new sq5(mc6Var.m8278r()) : aq5.f14788up;
        }
        if (iM8283w == 2) {
            return mc6Var.m8281u() ? new xo5(Double.valueOf(mc6Var.m8282v())) : new xo5(null);
        }
        if (iM8283w == 3) {
            return mc6Var.m8279s() ? new jo5(Boolean.valueOf(mc6Var.m8280t())) : new jo5(null);
        }
        if (iM8283w != 4) {
            C1077qn.m9987m("Unknown type found. Cannot convert entity");
            return null;
        }
        List listM8275o = mc6Var.m8275o();
        ArrayList arrayList = new ArrayList();
        Iterator it = listM8275o.iterator();
        while (it.hasNext()) {
            arrayList.add(m6933c((mc6) it.next()));
        }
        String strM8276p = mc6Var.m8276p();
        dq5 dq5Var = new dq5();
        dq5Var.f17286a = strM8276p;
        ArrayList arrayList2 = new ArrayList();
        dq5Var.f17287b = arrayList2;
        arrayList2.addAll(arrayList);
        VarHandle.storeStoreFence();
        return dq5Var;
    }
}
