package p000;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ys0 {

    /* JADX INFO: renamed from: a */
    public LinkedHashMap f35491a = new LinkedHashMap();

    /* JADX INFO: renamed from: a */
    public void m13231a(HashMap map) {
        Object[] objArr;
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            LinkedHashMap linkedHashMap = this.f35491a;
            if (value == null) {
                value = null;
            } else {
                r90 r90VarM10361a = rl3.m10361a(value.getClass());
                if (!r90VarM10361a.equals(rl3.m10361a(Boolean.TYPE)) && !r90VarM10361a.equals(rl3.m10361a(Byte.TYPE)) && !r90VarM10361a.equals(rl3.m10361a(Integer.TYPE)) && !r90VarM10361a.equals(rl3.m10361a(Long.TYPE)) && !r90VarM10361a.equals(rl3.m10361a(Float.TYPE)) && !r90VarM10361a.equals(rl3.m10361a(Double.TYPE)) && !r90VarM10361a.equals(rl3.m10361a(String.class)) && !r90VarM10361a.equals(rl3.m10361a(Boolean[].class)) && !r90VarM10361a.equals(rl3.m10361a(Byte[].class)) && !r90VarM10361a.equals(rl3.m10361a(Integer[].class)) && !r90VarM10361a.equals(rl3.m10361a(Long[].class)) && !r90VarM10361a.equals(rl3.m10361a(Float[].class)) && !r90VarM10361a.equals(rl3.m10361a(Double[].class)) && !r90VarM10361a.equals(rl3.m10361a(String[].class))) {
                    int i = 0;
                    if (r90VarM10361a.equals(rl3.m10361a(boolean[].class))) {
                        boolean[] zArr = (boolean[]) value;
                        String str2 = vu0.f32875a;
                        int length = zArr.length;
                        objArr = new Boolean[length];
                        while (i < length) {
                            objArr[i] = Boolean.valueOf(zArr[i]);
                            i++;
                        }
                    } else if (r90VarM10361a.equals(rl3.m10361a(byte[].class))) {
                        byte[] bArr = (byte[]) value;
                        String str3 = vu0.f32875a;
                        int length2 = bArr.length;
                        objArr = new Byte[length2];
                        while (i < length2) {
                            objArr[i] = Byte.valueOf(bArr[i]);
                            i++;
                        }
                    } else if (r90VarM10361a.equals(rl3.m10361a(int[].class))) {
                        int[] iArr = (int[]) value;
                        String str4 = vu0.f32875a;
                        int length3 = iArr.length;
                        objArr = new Integer[length3];
                        while (i < length3) {
                            objArr[i] = Integer.valueOf(iArr[i]);
                            i++;
                        }
                    } else if (r90VarM10361a.equals(rl3.m10361a(long[].class))) {
                        long[] jArr = (long[]) value;
                        String str5 = vu0.f32875a;
                        int length4 = jArr.length;
                        objArr = new Long[length4];
                        while (i < length4) {
                            objArr[i] = Long.valueOf(jArr[i]);
                            i++;
                        }
                    } else if (r90VarM10361a.equals(rl3.m10361a(float[].class))) {
                        float[] fArr = (float[]) value;
                        String str6 = vu0.f32875a;
                        int length5 = fArr.length;
                        objArr = new Float[length5];
                        while (i < length5) {
                            objArr[i] = Float.valueOf(fArr[i]);
                            i++;
                        }
                    } else {
                        if (!r90VarM10361a.equals(rl3.m10361a(double[].class))) {
                            nm0.m8797j("Key ", str, " has invalid type ", r90VarM10361a);
                            return;
                        }
                        double[] dArr = (double[]) value;
                        String str7 = vu0.f32875a;
                        int length6 = dArr.length;
                        objArr = new Double[length6];
                        while (i < length6) {
                            objArr[i] = Double.valueOf(dArr[i]);
                            i++;
                        }
                    }
                    value = objArr;
                }
            }
            linkedHashMap.put(str, value);
        }
    }

    /* JADX INFO: renamed from: b */
    public qb4 m13232b(e25 e25Var) {
        return (qb4) this.f35491a.remove(e25Var);
    }

    /* JADX INFO: renamed from: c */
    public List m13233c(String str) {
        LinkedHashMap linkedHashMap = this.f35491a;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (z62.m13387o(((e25) entry.getKey()).f17648a, str)) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = linkedHashMap2.keySet().iterator();
        while (it.hasNext()) {
            linkedHashMap.remove((e25) it.next());
        }
        return hb0.m6319e1(linkedHashMap2.values());
    }

    /* JADX INFO: renamed from: d */
    public qb4 m13234d(e25 e25Var) {
        LinkedHashMap linkedHashMap = this.f35491a;
        Object qb4Var = linkedHashMap.get(e25Var);
        if (qb4Var == null) {
            qb4Var = new qb4(e25Var);
            linkedHashMap.put(e25Var, qb4Var);
        }
        return (qb4) qb4Var;
    }
}
