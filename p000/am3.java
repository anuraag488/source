package p000;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class am3 extends xl3 {

    /* JADX INFO: renamed from: e */
    public static final HashMap f14627e;

    /* JADX INFO: renamed from: b */
    public Constructor f14628b;

    /* JADX INFO: renamed from: c */
    public Object[] f14629c;

    /* JADX INFO: renamed from: d */
    public HashMap f14630d;

    static {
        HashMap map = new HashMap();
        map.put(Byte.TYPE, (byte) 0);
        map.put(Short.TYPE, (short) 0);
        map.put(Integer.TYPE, 0);
        map.put(Long.TYPE, 0L);
        map.put(Float.TYPE, Float.valueOf(0.0f));
        map.put(Double.TYPE, Double.valueOf(0.0d));
        map.put(Character.TYPE, (char) 0);
        map.put(Boolean.TYPE, Boolean.FALSE);
        f14627e = map;
    }

    @Override // p000.xl3
    /* JADX INFO: renamed from: d */
    public final Object mo3045d() {
        return (Object[]) this.f14629c.clone();
    }

    @Override // p000.xl3
    /* JADX INFO: renamed from: e */
    public final Object mo3046e(Object obj) {
        Object[] objArr = (Object[]) obj;
        Constructor constructor = this.f14628b;
        try {
            return constructor.newInstance(objArr);
        } catch (IllegalAccessException e) {
            c20 c20Var = vl3.f32723a;
            xy4.m12785n("Unexpected IllegalAccessException occurred (Gson 2.13.2). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
            return null;
        } catch (IllegalArgumentException | InstantiationException e2) {
            throw new RuntimeException("Failed to invoke constructor '" + vl3.m11926b(constructor) + "' with args " + Arrays.toString(objArr), e2);
        } catch (InvocationTargetException e3) {
            xy4.m12785n("Failed to invoke constructor '" + vl3.m11926b(constructor) + "' with args " + Arrays.toString(objArr), e3.getCause());
            return null;
        }
    }

    @Override // p000.xl3
    /* JADX INFO: renamed from: f */
    public final void mo3047f(Object obj, kb2 kb2Var, wl3 wl3Var) {
        Object[] objArr = (Object[]) obj;
        HashMap map = this.f14630d;
        String str = wl3Var.f33464c;
        Integer num = (Integer) map.get(str);
        if (num == null) {
            wb1.m12193l("Could not find the index in the constructor '", vl3.m11926b(this.f14628b), "' for field with name '", str, "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters.");
            return;
        }
        int iIntValue = num.intValue();
        Object objMo166b = wl3Var.f33467f.mo166b(kb2Var);
        if (objMo166b != null || !wl3Var.f33468g) {
            objArr[iIntValue] = objMo166b;
        } else {
            StringBuilder sbM10844j = sk5.m10844j("null is not allowed as value for record component '", str, "' of primitive type; at path ");
            sbM10844j.append(kb2Var.mo7498q());
            throw new za2(sbM10844j.toString());
        }
    }
}
