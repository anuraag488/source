package p000;

import java.lang.invoke.VarHandle;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class bm3 implements vq4 {

    /* JADX INFO: renamed from: a */
    public z32 f15413a;

    /* JADX INFO: renamed from: b */
    public int f15414b;

    /* JADX INFO: renamed from: c */
    public qb1 f15415c;

    /* JADX INFO: renamed from: d */
    public l92 f15416d;

    /* JADX INFO: renamed from: e */
    public List f15417e;

    /* JADX INFO: renamed from: b */
    public static void m3627b(Class cls, String str, Field field, Field field2) {
        throw new IllegalArgumentException("Class " + cls.getName() + " declares multiple JSON fields named '" + str + "'; conflict is caused by fields " + vl3.m11927c(field) + " and " + vl3.m11927c(field2) + "\nSee https://github.com/google/gson/blob/main/Troubleshooting.md#duplicate-fields");
    }

    @Override // p000.vq4
    /* JADX INFO: renamed from: a */
    public final uq4 mo3628a(ou1 ou1Var, cs4 cs4Var) {
        Class cls = cs4Var.f16429a;
        if (!Object.class.isAssignableFrom(cls)) {
            return null;
        }
        c20 c20Var = vl3.f32723a;
        if (!Modifier.isStatic(cls.getModifiers()) && (cls.isAnonymousClass() || cls.isLocalClass())) {
            return new lu1((byte) 2);
        }
        AbstractC1356y5.m12930x(this.f15417e);
        c20 c20Var2 = vl3.f32723a;
        if (!c20Var2.mo3831z(cls)) {
            l23 l23VarM13329z = this.f15413a.m13329z(cs4Var, true);
            yl3 yl3Var = new yl3(m3629c(ou1Var, cs4Var, cls, false));
            yl3Var.f35316b = l23VarM13329z;
            VarHandle.storeStoreFence();
            return yl3Var;
        }
        am3 am3Var = new am3(m3629c(ou1Var, cs4Var, cls, true));
        am3Var.f14630d = new HashMap();
        Constructor constructorMo3829r = c20Var2.mo3829r(cls);
        am3Var.f14628b = constructorMo3829r;
        vl3.m11930f(constructorMo3829r);
        String[] strArrMo3830v = c20Var2.mo3830v(cls);
        for (int i = 0; i < strArrMo3830v.length; i++) {
            am3Var.f14630d.put(strArrMo3830v[i], Integer.valueOf(i));
        }
        Class<?>[] parameterTypes = am3Var.f14628b.getParameterTypes();
        am3Var.f14629c = new Object[parameterTypes.length];
        for (int i2 = 0; i2 < parameterTypes.length; i2++) {
            am3Var.f14629c[i2] = am3.f14627e.get(parameterTypes[i2]);
        }
        VarHandle.storeStoreFence();
        return am3Var;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0204 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:? A[LOOP:2: B:83:0x01ef->B:109:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x008f  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:46:0x0101  */
    /* JADX WARN: Code duplicated, block: B:47:0x010a  */
    /* JADX WARN: Code duplicated, block: B:49:0x0111  */
    /* JADX WARN: Code duplicated, block: B:52:0x0123  */
    /* JADX WARN: Code duplicated, block: B:53:0x012d  */
    /* JADX WARN: Code duplicated, block: B:59:0x0159  */
    /* JADX WARN: Code duplicated, block: B:65:0x016d  */
    /* JADX WARN: Code duplicated, block: B:68:0x0179  */
    /* JADX WARN: Code duplicated, block: B:69:0x019e  */
    /* JADX WARN: Code duplicated, block: B:71:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:72:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:74:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:79:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:82:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:85:0x01f5  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r1v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v1 */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r22v2 */
    /* JADX WARN: Type inference failed for: r22v3 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [int] */
    /* JADX INFO: renamed from: c */
    public final zl3 m3629c(ou1 ou1Var, cs4 cs4Var, Class cls, boolean z) {
        boolean z2;
        Method methodMo3828p;
        int i;
        s24 s24Var;
        String strValue;
        List listAsList;
        ?? SingletonList;
        ?? r3;
        String str;
        cs4 cs4Var2;
        Class cls2;
        ?? r2;
        int modifiers;
        ?? r21;
        j92 j92Var;
        ou1 ou1Var2;
        Field field;
        boolean z3;
        ?? r14;
        String str2;
        uq4 uq4VarM9271d;
        boolean z4;
        uq4 bq2Var;
        wl3 wl3Var;
        wl3 wl3Var2;
        wl3 wl3Var3;
        if (cls.isInterface()) {
            return zl3.f36167c;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        cs4 cs4Var3 = cs4Var;
        Class cls3 = cls;
        while (cls3 != Object.class) {
            Field[] declaredFields = cls3.getDeclaredFields();
            if (cls3 != cls && declaredFields.length > 0) {
                AbstractC1356y5.m12930x(this.f15417e);
            }
            int length = declaredFields.length;
            boolean z5 = false;
            int i2 = 0;
            while (i2 < length) {
                Field field2 = declaredFields[i2];
                boolean zM3630d = this.m3630d(field2, true);
                boolean zM3630d2 = this.m3630d(field2, z5);
                if (zM3630d || zM3630d2) {
                    if (z) {
                        if (Modifier.isStatic(field2.getModifiers())) {
                            z2 = z5;
                        } else {
                            methodMo3828p = vl3.f32723a.mo3828p(cls3, field2);
                            vl3.m11930f(methodMo3828p);
                            if (methodMo3828p.getAnnotation(s24.class) != null && field2.getAnnotation(s24.class) == null) {
                                throw new ia2(zi4.m13621u("@SerializedName on ", vl3.m11928d(methodMo3828p, z5), " is not supported"));
                            }
                            z2 = zM3630d2;
                        }
                        if (methodMo3828p == null) {
                            vl3.m11930f(field2);
                        }
                        Type typeM10090O = qs5.m10090O(cs4Var3.f16430b, cls3, field2.getGenericType(), new HashMap());
                        i = this.f15414b;
                        s24Var = (s24) field2.getAnnotation(s24.class);
                        if (s24Var == null) {
                            switch (i) {
                                case 1:
                                    strValue = field2.getName();
                                    break;
                                case 2:
                                    strValue = d55.m4357b(field2.getName());
                                    break;
                                case 3:
                                    strValue = d55.m4357b(d55.m4356a(field2.getName(), ' '));
                                    break;
                                case 4:
                                    strValue = d55.m4356a(field2.getName(), '_').toUpperCase(Locale.ENGLISH);
                                    break;
                                case 5:
                                    strValue = d55.m4356a(field2.getName(), '_').toLowerCase(Locale.ENGLISH);
                                    break;
                                case 6:
                                    strValue = d55.m4356a(field2.getName(), '-').toLowerCase(Locale.ENGLISH);
                                    break;
                                default:
                                    strValue = d55.m4356a(field2.getName(), '.').toLowerCase(Locale.ENGLISH);
                                    break;
                            }
                            listAsList = Collections.EMPTY_LIST;
                        } else {
                            strValue = s24Var.value();
                            listAsList = Arrays.asList(s24Var.alternate());
                        }
                        if (listAsList.isEmpty()) {
                            boolean z6 = z5;
                            SingletonList = Collections.singletonList(strValue);
                            r3 = z6;
                        } else {
                            ArrayList arrayList = new ArrayList(listAsList.size() + 1);
                            arrayList.add(strValue);
                            arrayList.addAll(listAsList);
                            SingletonList = arrayList;
                            r3 = 0;
                        }
                        str = (String) SingletonList.get(r3);
                        cs4Var2 = new cs4(typeM10090O);
                        cls2 = cs4Var2.f16429a;
                        if (cls2 == null && cls2.isPrimitive()) {
                            r2 = 1;
                        } else {
                            r2 = r3;
                        }
                        modifiers = field2.getModifiers();
                        if (Modifier.isStatic(modifiers) || !Modifier.isFinal(modifiers)) {
                            r21 = r3;
                        } else {
                            r21 = 1;
                        }
                        j92Var = (j92) field2.getAnnotation(j92.class);
                        if (j92Var != null) {
                            l92 l92Var = this.f15416d;
                            ?? r22 = r2;
                            z32 z32Var = this.f15413a;
                            r14 = r22 == true ? 1 : 0;
                            field = field2;
                            str2 = str;
                            z3 = false;
                            ou1Var2 = ou1Var;
                            uq4VarM9271d = l92Var.m7874b(z32Var, ou1Var2, cs4Var2, j92Var, false);
                        } else {
                            ou1Var2 = ou1Var;
                            field = field2;
                            z3 = false;
                            r14 = r2;
                            str2 = str;
                            uq4VarM9271d = null;
                        }
                        if (uq4VarM9271d != null) {
                            z4 = true;
                        } else {
                            z4 = z3;
                        }
                        if (uq4VarM9271d == null) {
                            uq4VarM9271d = ou1Var2.m9271d(cs4Var2);
                        }
                        if (zM3630d || z4) {
                            bq2Var = uq4VarM9271d;
                        } else {
                            bq2Var = new bq2(ou1Var2, uq4VarM9271d, cs4Var2.f16430b);
                        }
                        wl3Var = new wl3();
                        wl3Var.f33465d = methodMo3828p;
                        wl3Var.f33466e = bq2Var;
                        wl3Var.f33467f = uq4VarM9271d;
                        wl3Var.f33468g = r14;
                        wl3Var.f33469h = r21;
                        wl3Var.f33462a = str2;
                        wl3Var.f33463b = field;
                        wl3Var.f33464c = field.getName();
                        VarHandle.storeStoreFence();
                        if (z2) {
                            for (String str3 : SingletonList) {
                                wl3Var3 = (wl3) linkedHashMap.put(str3, wl3Var);
                                if (wl3Var3 == null) {
                                    m3627b(cls, str3, wl3Var3.f33463b, field);
                                    throw null;
                                }
                            }
                        }
                        if (zM3630d && (wl3Var2 = (wl3) linkedHashMap2.put(str2, wl3Var)) != null) {
                            m3627b(cls, str2, wl3Var2.f33463b, field);
                            throw null;
                        }
                    } else {
                        z2 = zM3630d2;
                    }
                    methodMo3828p = null;
                    if (methodMo3828p == null) {
                        vl3.m11930f(field2);
                    }
                    Type typeM10090O2 = qs5.m10090O(cs4Var3.f16430b, cls3, field2.getGenericType(), new HashMap());
                    i = this.f15414b;
                    s24Var = (s24) field2.getAnnotation(s24.class);
                    if (s24Var == null) {
                        switch (i) {
                            case 1:
                                strValue = field2.getName();
                                break;
                            case 2:
                                strValue = d55.m4357b(field2.getName());
                                break;
                            case 3:
                                strValue = d55.m4357b(d55.m4356a(field2.getName(), ' '));
                                break;
                            case 4:
                                strValue = d55.m4356a(field2.getName(), '_').toUpperCase(Locale.ENGLISH);
                                break;
                            case 5:
                                strValue = d55.m4356a(field2.getName(), '_').toLowerCase(Locale.ENGLISH);
                                break;
                            case 6:
                                strValue = d55.m4356a(field2.getName(), '-').toLowerCase(Locale.ENGLISH);
                                break;
                            default:
                                strValue = d55.m4356a(field2.getName(), '.').toLowerCase(Locale.ENGLISH);
                                break;
                        }
                        listAsList = Collections.EMPTY_LIST;
                    } else {
                        strValue = s24Var.value();
                        listAsList = Arrays.asList(s24Var.alternate());
                    }
                    if (listAsList.isEmpty()) {
                        boolean z7 = z5;
                        SingletonList = Collections.singletonList(strValue);
                        r3 = z7;
                    } else {
                        ArrayList arrayList2 = new ArrayList(listAsList.size() + 1);
                        arrayList2.add(strValue);
                        arrayList2.addAll(listAsList);
                        SingletonList = arrayList2;
                        r3 = 0;
                    }
                    str = (String) SingletonList.get(r3);
                    cs4Var2 = new cs4(typeM10090O2);
                    cls2 = cs4Var2.f16429a;
                    if (cls2 == null) {
                        r2 = r3;
                    } else {
                        r2 = r3;
                    }
                    modifiers = field2.getModifiers();
                    if (Modifier.isStatic(modifiers)) {
                        r21 = r3;
                    } else {
                        r21 = r3;
                    }
                    j92Var = (j92) field2.getAnnotation(j92.class);
                    if (j92Var != null) {
                        l92 l92Var2 = this.f15416d;
                        ?? r23 = r2;
                        z32 z32Var2 = this.f15413a;
                        r14 = r23 == true ? 1 : 0;
                        field = field2;
                        str2 = str;
                        z3 = false;
                        ou1Var2 = ou1Var;
                        uq4VarM9271d = l92Var2.m7874b(z32Var2, ou1Var2, cs4Var2, j92Var, false);
                    } else {
                        ou1Var2 = ou1Var;
                        field = field2;
                        z3 = false;
                        r14 = r2;
                        str2 = str;
                        uq4VarM9271d = null;
                    }
                    if (uq4VarM9271d != null) {
                        z4 = true;
                    } else {
                        z4 = z3;
                    }
                    if (uq4VarM9271d == null) {
                        uq4VarM9271d = ou1Var2.m9271d(cs4Var2);
                    }
                    if (zM3630d) {
                        bq2Var = uq4VarM9271d;
                    } else {
                        bq2Var = uq4VarM9271d;
                    }
                    wl3Var = new wl3();
                    wl3Var.f33465d = methodMo3828p;
                    wl3Var.f33466e = bq2Var;
                    wl3Var.f33467f = uq4VarM9271d;
                    wl3Var.f33468g = r14;
                    wl3Var.f33469h = r21;
                    wl3Var.f33462a = str2;
                    wl3Var.f33463b = field;
                    wl3Var.f33464c = field.getName();
                    VarHandle.storeStoreFence();
                    if (z2) {
                        while (r1.hasNext()) {
                            wl3Var3 = (wl3) linkedHashMap.put(str3, wl3Var);
                            if (wl3Var3 == null) {
                                m3627b(cls, str3, wl3Var3.f33463b, field);
                                throw null;
                            }
                        }
                    }
                    if (zM3630d) {
                        continue;
                    }
                } else {
                    declaredFields = declaredFields;
                    length = length;
                    z3 = z5;
                }
                i2++;
                this = this;
                declaredFields = declaredFields;
                length = length;
                z5 = z3;
            }
            cs4Var3 = new cs4(qs5.m10090O(cs4Var3.f16430b, cls3, cls3.getGenericSuperclass(), new HashMap()));
            cls3 = cs4Var3.f16429a;
        }
        return new zl3(linkedHashMap, new ArrayList(linkedHashMap2.values()));
    }

    /* JADX INFO: renamed from: d */
    public final boolean m3630d(Field field, boolean z) {
        boolean z2;
        qb1 qb1Var = this.f15415c;
        qb1Var.getClass();
        if ((136 & field.getModifiers()) != 0 || field.isSynthetic() || qb1Var.m9860b(field.getType(), z)) {
            z2 = true;
        } else {
            List list = z ? qb1Var.f28358a : qb1Var.f28359b;
            z2 = false;
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    xy4.m12778e();
                    return false;
                }
            }
        }
        return !z2;
    }
}
