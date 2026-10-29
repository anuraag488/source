package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Trace;
import android.view.KeyEvent;
import androidx.compose.p001ui.platform.AndroidCompositionLocals_androidKt;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.invoke.VarHandle;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class qs5 {

    /* JADX INFO: renamed from: b */
    public static Context f28769b;

    /* JADX INFO: renamed from: c */
    public static Bundle f28770c;

    /* JADX INFO: renamed from: j */
    public static g12 f28777j;

    /* JADX INFO: renamed from: k */
    public static g12 f28778k;

    /* JADX INFO: renamed from: a */
    public static final Object f28768a = new Object();

    /* JADX INFO: renamed from: d */
    public static final C0891m f28771d = new C0891m(2);

    /* JADX INFO: renamed from: e */
    public static final pg0 f28772e = new pg0(304262441, false, new me0(1));

    /* JADX INFO: renamed from: f */
    public static final pg0 f28773f = new pg0(358040005, false, new ah0(27));

    /* JADX INFO: renamed from: g */
    public static final Type[] f28774g = new Type[0];

    /* JADX INFO: renamed from: h */
    public static final StackTraceElement[] f28775h = new StackTraceElement[0];

    /* JADX INFO: renamed from: i */
    public static final z45 f28776i = new z45(23);

    /* JADX INFO: renamed from: A */
    public static final float m10076A(ro0 ro0Var) {
        du2 du2Var = (du2) ro0Var.get(o85.f26449i);
        float fMo4740D = du2Var != null ? du2Var.mo4740D() : 1.0f;
        if (fMo4740D >= 0.0f) {
            return fMo4740D;
        }
        md3.m8285b("negative scale factor");
        return fMo4740D;
    }

    /* JADX INFO: renamed from: B */
    public static Type m10077B(Type type, Class cls, Class cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i = 0; i < length; i++) {
                Class<?> cls3 = interfaces[i];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return m10077B(cls.getGenericInterfaces()[i], interfaces[i], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<?> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return m10077B(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    /* JADX INFO: renamed from: C */
    public static final g12 m10078C() {
        g12 g12Var = f28777j;
        if (g12Var != null) {
            return g12Var;
        }
        f12 f12Var = new f12("Outlined.Info", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = uw4.f32218a;
        ga4 ga4Var = new ga4(pb0.f27495b);
        tv1 tv1Var = new tv1((byte) 1);
        tv1Var.m11175k(11.0f, 7.0f);
        tv1Var.m11172h(2.0f);
        tv1Var.m11180p(2.0f);
        tv1Var.m11172h(-2.0f);
        tv1Var.m11168d();
        tv1Var.m11175k(11.0f, 11.0f);
        tv1Var.m11172h(2.0f);
        tv1Var.m11180p(6.0f);
        tv1Var.m11172h(-2.0f);
        tv1Var.m11168d();
        tv1Var.m11175k(12.0f, 2.0f);
        tv1Var.m11169e(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        tv1Var.m11177m(4.48f, 10.0f, 10.0f, 10.0f);
        tv1Var.m11177m(10.0f, -4.48f, 10.0f, -10.0f);
        tv1Var.m11176l(17.52f, 2.0f, 12.0f, 2.0f);
        tv1Var.m11168d();
        tv1Var.m11175k(12.0f, 20.0f);
        tv1Var.m11170f(-4.41f, 0.0f, -8.0f, -3.59f, -8.0f, -8.0f);
        tv1Var.m11177m(3.59f, -8.0f, 8.0f, -8.0f);
        tv1Var.m11177m(8.0f, 3.59f, 8.0f, 8.0f);
        tv1Var.m11177m(-3.59f, 8.0f, -8.0f, 8.0f);
        tv1Var.m11168d();
        f12.m5445c(f12Var, tv1Var.f31466a, ga4Var, 1.0f, 1.0f, 2, 1.0f, 14336);
        g12 g12VarM5449e = f12Var.m5449e();
        f28777j = g12VarM5449e;
        return g12VarM5449e;
    }

    /* JADX INFO: renamed from: D */
    public static final long m10079D(KeyEvent keyEvent) {
        return i20.m6579d(keyEvent.getKeyCode());
    }

    /* JADX INFO: renamed from: E */
    public static Class m10080E(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return (Class) ((ParameterizedType) type).getRawType();
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance((Class<?>) m10080E(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return m10080E(((WildcardType) type).getUpperBounds()[0]);
        }
        nm0.m8797j("Expected a Class, ParameterizedType, or GenericArrayType, but <", type, "> is of type ", type == null ? "null" : type.getClass().getName());
        return null;
    }

    /* JADX INFO: renamed from: F */
    public static final Bundle m10081F(String str, Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(str);
        if (bundle2 != null) {
            return bundle2;
        }
        C1077qn.m9987m(zi4.m13621u("No valid saved state was found for the key '", str, "'. It may be missing, null, or not of the expected type. This can occur if the value was saved with a different type or if the saved state was modified unexpectedly."));
        return null;
    }

    /* JADX INFO: renamed from: G */
    public static Type m10082G(Type type, Class cls, Class cls2) {
        if (type instanceof WildcardType) {
            type = ((WildcardType) type).getUpperBounds()[0];
        }
        if (cls2.isAssignableFrom(cls)) {
            return m10090O(type, cls, m10077B(type, cls, cls2), new HashMap());
        }
        throw new IllegalArgumentException(cls + " is not the same as or a subtype of " + cls2);
    }

    /* JADX INFO: renamed from: H */
    public static final int m10083H(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action != 0) {
            return action != 1 ? 0 : 1;
        }
        return 2;
    }

    /* JADX INFO: renamed from: I */
    public static n12 m10084I(Object obj) {
        return obj == null ? n12.f25382b : new n12(obj);
    }

    /* JADX INFO: renamed from: J */
    public static final long m10085J(long j) {
        if (j < 0) {
            r50 r50Var = i41.f21117b;
            return i41.f21119d;
        }
        r50 r50Var2 = i41.f21117b;
        return i41.f21118c;
    }

    /* JADX INFO: renamed from: K */
    public static final List m10086K(Context context) {
        Object objM10807c;
        List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.CREATE_SHORTCUT"), 0);
        ArrayList arrayList = new ArrayList();
        for (ResolveInfo resolveInfo : listQueryIntentActivities) {
            try {
                Intent intent = new Intent();
                intent.setAction("android.intent.action.CREATE_SHORTCUT");
                ActivityInfo activityInfo = resolveInfo.activityInfo;
                intent.setComponent(new ComponentName(activityInfo.packageName, activityInfo.name));
                String string = resolveInfo.loadLabel(context.getPackageManager()).toString();
                C0759ie c0759ie = new C0759ie(k43.m7377K(resolveInfo.loadIcon(context.getPackageManager())));
                String str = resolveInfo.activityInfo.packageName;
                i64 i64Var = new i64();
                i64Var.f21141a = intent;
                i64Var.f21142b = string;
                i64Var.f21143c = c0759ie;
                i64Var.f21144d = str;
                VarHandle.storeStoreFence();
                objM10807c = i64Var;
            } catch (Throwable th) {
                sc6.m10643O(th);
                objM10807c = sj3.m10807c(th);
            }
            boolean z = objM10807c instanceof yc1;
            Object obj = objM10807c;
            if (z) {
                obj = null;
            }
            i64 i64Var2 = (i64) obj;
            if (i64Var2 != null) {
                arrayList.add(i64Var2);
            }
        }
        return hb0.m6315a1(arrayList, new vl1((byte) 23));
    }

    /* JADX INFO: renamed from: L */
    public static zl2 m10087L(C1167t2 c1167t2) {
        if (c1167t2.isDone()) {
            return c1167t2;
        }
        br1 br1Var = new br1();
        br1Var.f15520h = c1167t2;
        c1167t2.mo6454a(br1Var, rz0.f29741a);
        return br1Var;
    }

    /* JADX INFO: renamed from: M */
    public static jp0 m10088M(String str) throws GeneralSecurityException {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(str.getBytes(la2.f23889b));
            la2 la2Var = new la2();
            la2Var.f23890a = byteArrayInputStream;
            VarHandle.storeStoreFence();
            return jp0.m7205K(la2Var);
        } catch (IOException unused) {
            xy4.m12788q("Parse keyset failed");
            return null;
        }
    }

    /* JADX INFO: renamed from: N */
    public static ro0 m10089N(ro0 ro0Var, ro0 ro0Var2) {
        return ro0Var2 == r71.f29063a ? ro0Var : (ro0) ro0Var2.fold(new en0((byte) 7), ro0Var);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0054  */
    /* JADX WARN: Code duplicated, block: B:41:0x007f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0083  */
    /* JADX WARN: Code duplicated, block: B:46:0x0095  */
    /* JADX WARN: Code duplicated, block: B:47:0x009b  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:60:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:68:0x0103  */
    /* JADX WARN: Code duplicated, block: B:69:0x010a  */
    /* JADX WARN: Code duplicated, block: B:71:0x011b  */
    /* JADX WARN: Code duplicated, block: B:77:0x012c  */
    /* JADX WARN: Code duplicated, block: B:78:0x0133  */
    /* JADX WARN: Code duplicated, block: B:93:0x00d1 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r12v10, types: [java.lang.Object, java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v17, types: [java.lang.reflect.Type[]] */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.reflect.WildcardType] */
    /* JADX WARN: Type inference failed for: r12v3, types: [ru1] */
    /* JADX WARN: Type inference failed for: r12v4, types: [ru1] */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.lang.reflect.ParameterizedType] */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.lang.reflect.GenericArrayType] */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX INFO: renamed from: O */
    public static Type m10090O(Type type, Class cls, Type type2, HashMap map) {
        Type[] lowerBounds;
        Type[] upperBounds;
        Type typeM10090O;
        Type[] upperBounds2;
        Type typeM10090O2;
        Type[] lowerBounds2;
        boolean zEquals;
        int length;
        Type[] typeArr;
        boolean z;
        Type qu1Var;
        Type typeM10090O3;
        Type genericComponentType;
        Type typeM10090O4;
        TypeVariable typeVariable;
        TypeVariable typeVariable2 = null;
        do {
            int i = 0;
            if (!(type2 instanceof TypeVariable)) {
                if (!(type2 instanceof Class)) {
                    if (type2 instanceof GenericArrayType) {
                        if (type2 instanceof ParameterizedType) {
                            if (type2 instanceof WildcardType) {
                                break;
                            }
                            type2 = (WildcardType) type2;
                            lowerBounds = type2.getLowerBounds();
                            upperBounds = type2.getUpperBounds();
                            if (lowerBounds.length == 1) {
                                if (upperBounds.length != 1) {
                                    break;
                                }
                                if (typeM10090O instanceof WildcardType) {
                                    upperBounds2 = ((WildcardType) typeM10090O).getUpperBounds();
                                } else {
                                    upperBounds2 = new Type[]{typeM10090O};
                                }
                                type2 = new ru1(upperBounds2, f28774g);
                                break;
                            }
                            typeM10090O2 = m10090O(type, cls, lowerBounds[0], map);
                            if (typeM10090O2 != lowerBounds[0]) {
                                break;
                            }
                            if (typeM10090O2 instanceof WildcardType) {
                                lowerBounds2 = ((WildcardType) typeM10090O2).getLowerBounds();
                            } else {
                                lowerBounds2 = new Type[]{typeM10090O2};
                            }
                            type2 = new ru1(new Type[]{Object.class}, lowerBounds2);
                            break;
                        }
                        type2 = (ParameterizedType) type2;
                        Type ownerType = type2.getOwnerType();
                        Type typeM10090O5 = m10090O(type, cls, ownerType, map);
                        zEquals = Objects.equals(typeM10090O5, ownerType);
                        Type[] actualTypeArguments = type2.getActualTypeArguments();
                        length = actualTypeArguments.length;
                        typeArr = actualTypeArguments;
                        z = false;
                        while (i < length) {
                            typeM10090O3 = m10090O(type, cls, typeArr[i], map);
                            if (Objects.equals(typeM10090O3, typeArr[i])) {
                                if (!z) {
                                    typeArr = (Type[]) typeArr.clone();
                                    z = true;
                                }
                                typeArr[i] = typeM10090O3;
                            }
                            i++;
                        }
                        if (!zEquals) {
                        }
                        qu1Var = new qu1(typeM10090O5, (Class) type2.getRawType(), typeArr);
                        type2 = qu1Var;
                        break;
                    }
                    type2 = (GenericArrayType) type2;
                    genericComponentType = type2.getGenericComponentType();
                    typeM10090O4 = m10090O(type, cls, genericComponentType, map);
                    if (Objects.equals(genericComponentType, typeM10090O4)) {
                        qu1Var = new pu1(typeM10090O4);
                        type2 = qu1Var;
                        break;
                    }
                    break;
                }
                Class cls2 = (Class) type2;
                if (!cls2.isArray()) {
                    if (type2 instanceof GenericArrayType) {
                        if (type2 instanceof ParameterizedType) {
                            if (type2 instanceof WildcardType) {
                                break;
                            }
                            type2 = (WildcardType) type2;
                            lowerBounds = type2.getLowerBounds();
                            upperBounds = type2.getUpperBounds();
                            if (lowerBounds.length == 1) {
                                if (upperBounds.length != 1 && (typeM10090O = m10090O(type, cls, upperBounds[0], map)) != upperBounds[0]) {
                                    if (typeM10090O instanceof WildcardType) {
                                        upperBounds2 = ((WildcardType) typeM10090O).getUpperBounds();
                                    } else {
                                        upperBounds2 = new Type[]{typeM10090O};
                                    }
                                    type2 = new ru1(upperBounds2, f28774g);
                                    break;
                                }
                                break;
                                break;
                            }
                            typeM10090O2 = m10090O(type, cls, lowerBounds[0], map);
                            if (typeM10090O2 != lowerBounds[0]) {
                                break;
                            }
                            if (typeM10090O2 instanceof WildcardType) {
                                lowerBounds2 = ((WildcardType) typeM10090O2).getLowerBounds();
                            } else {
                                lowerBounds2 = new Type[]{typeM10090O2};
                            }
                            type2 = new ru1(new Type[]{Object.class}, lowerBounds2);
                            break;
                        }
                        type2 = (ParameterizedType) type2;
                        Type ownerType2 = type2.getOwnerType();
                        Type typeM10090O6 = m10090O(type, cls, ownerType2, map);
                        zEquals = Objects.equals(typeM10090O6, ownerType2);
                        Type[] actualTypeArguments2 = type2.getActualTypeArguments();
                        length = actualTypeArguments2.length;
                        typeArr = actualTypeArguments2;
                        z = false;
                        while (i < length) {
                            typeM10090O3 = m10090O(type, cls, typeArr[i], map);
                            if (Objects.equals(typeM10090O3, typeArr[i])) {
                                if (!z) {
                                    typeArr = (Type[]) typeArr.clone();
                                    z = true;
                                }
                                typeArr[i] = typeM10090O3;
                            }
                            i++;
                        }
                        if (!zEquals && !z) {
                            break;
                        }
                        qu1Var = new qu1(typeM10090O6, (Class) type2.getRawType(), typeArr);
                        type2 = qu1Var;
                        break;
                    }
                    type2 = (GenericArrayType) type2;
                    genericComponentType = type2.getGenericComponentType();
                    typeM10090O4 = m10090O(type, cls, genericComponentType, map);
                    if (Objects.equals(genericComponentType, typeM10090O4)) {
                        break;
                    }
                    qu1Var = new pu1(typeM10090O4);
                    type2 = qu1Var;
                    break;
                }
                Class<?> componentType = cls2.getComponentType();
                Type typeM10090O7 = m10090O(type, cls, componentType, map);
                if (!Objects.equals(componentType, typeM10090O7)) {
                    qu1Var = new pu1(typeM10090O7);
                    type2 = qu1Var;
                    break;
                }
                type2 = cls2;
                break;
            }
            typeVariable = (TypeVariable) type2;
            Type type3 = (Type) map.get(typeVariable);
            Class cls3 = Void.TYPE;
            if (type3 != null) {
                return type3 == cls3 ? type2 : type3;
            }
            map.put(typeVariable, cls3);
            if (typeVariable2 == null) {
                typeVariable2 = typeVariable;
            }
            GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
            Class cls4 = genericDeclaration instanceof Class ? (Class) genericDeclaration : null;
            if (cls4 == null) {
                type2 = typeVariable;
            } else {
                Type typeM10077B = m10077B(type, cls, cls4);
                if (typeM10077B instanceof ParameterizedType) {
                    TypeVariable[] typeParameters = cls4.getTypeParameters();
                    int length2 = typeParameters.length;
                    while (true) {
                        if (i >= length2) {
                            xy4.m12795x();
                            return null;
                        }
                        if (typeVariable.equals(typeParameters[i])) {
                            type2 = ((ParameterizedType) typeM10077B).getActualTypeArguments()[i];
                            break;
                        }
                        i++;
                    }
                } else {
                    type2 = typeVariable;
                }
            }
        } while (type2 != typeVariable);
        if (typeVariable2 != null) {
            map.put(typeVariable2, type2);
        }
        return type2;
    }

    /* JADX INFO: renamed from: P */
    public static final long m10091P(long j, long j2) {
        m41 m41Var = m41.NANOSECONDS;
        long j3 = j - j2;
        if (((j3 ^ j) & (~(j3 ^ j2))) >= 0) {
            return as4.m3239R(j3, m41Var);
        }
        m41 m41Var2 = m41.MILLISECONDS;
        if (m41Var.compareTo(m41Var2) >= 0) {
            return i41.m6657p(m10085J(j3));
        }
        long j4 = (j / 1000000) - (j2 / 1000000);
        long j5 = (j % 1000000) - (j2 % 1000000);
        r50 r50Var = i41.f21117b;
        return i41.m6652k(as4.m3239R(j4, m41Var2), as4.m3239R(j5, m41Var));
    }

    /* JADX INFO: renamed from: Q */
    public static pq4 m10092Q(Callable callable, Executor executor) {
        pq4 pq4Var = new pq4(callable);
        executor.execute(pq4Var);
        return pq4Var;
    }

    /* JADX INFO: renamed from: R */
    public static String m10093R(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    /* JADX INFO: renamed from: S */
    public static final void m10094S(C1370yj c1370yj, C0457ak c0457ak) {
        c0457ak.f14572b.setValue(c1370yj.f35255e.getValue());
        AbstractC0654fk abstractC0654fk = c0457ak.f14573c;
        AbstractC0654fk abstractC0654fk2 = c1370yj.f35256f;
        int iMo4034b = abstractC0654fk.mo4034b();
        for (int i = 0; i < iMo4034b; i++) {
            abstractC0654fk.mo3610e(abstractC0654fk2.mo3608a(i), i);
        }
        c0457ak.f14575e = c1370yj.f35258h;
        c0457ak.f14574d = c1370yj.f35257g;
        c0457ak.f14576f = ((Boolean) c1370yj.f35259i.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: T */
    public static Bundle m10095T(Context context) {
        Bundle bundle;
        ServiceInfo serviceInfo;
        Bundle bundle2;
        Context applicationContext = context.getApplicationContext();
        synchronized (f28768a) {
            if (applicationContext != f28769b) {
                ry5.m10503a("CronetManifest#getMetaData fetching info");
                try {
                    try {
                        serviceInfo = applicationContext.getPackageManager().getServiceInfo(new ComponentName(applicationContext, "android.net.http.MetaDataHolder"), 787072);
                    } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
                        serviceInfo = null;
                    }
                    if (serviceInfo == null || (bundle2 = serviceInfo.metaData) == null) {
                        bundle2 = new Bundle();
                    }
                    f28770c = bundle2;
                    f28769b = applicationContext;
                    Trace.endSection();
                } catch (Throwable th) {
                    try {
                        Trace.endSection();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            bundle = f28770c;
        }
        return bundle;
    }

    /* JADX INFO: renamed from: a */
    public static final void m10096a(yp1 yp1Var, mi0 mi0Var, int i) {
        int i2;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(-43327670);
        if ((i & 6) == 0) {
            i2 = (ir1Var.m6894i(yp1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        byte b = 1;
        if (ir1Var.m6871T(i2 & 1, (i2 & 3) != 2)) {
            mq1 mq1VarM12962c0 = y62.m12962c0(ir1Var);
            Context context = (Context) ir1Var.m6898k(AndroidCompositionLocals_androidKt.f14651b);
            mq1 mq1VarM10008C = qq2.m10008C(ir1Var);
            Object[] objArr = new Object[0];
            boolean zM6894i = ir1Var.m6894i(context) | ir1Var.m6894i(mq1VarM12962c0);
            Object objM6869O = ir1Var.m6869O();
            i50 i50Var = ki0.f23136a;
            if (zM6894i || objM6869O == i50Var) {
                objM6869O = new n64(context, mq1VarM12962c0, null);
                ir1Var.m6905n0(objM6869O);
            }
            po3 po3Var = (po3) y62.m12950R(om2.f26879a, objArr, (yp1) objM6869O, ir1Var).getValue();
            List list = po3Var instanceof ke4 ? ((ke4) po3Var).f23085a : v71.f32439a;
            yp1 yp1VarM5366p0 = ev0.m5366p0(ir1Var);
            boolean zM6894i2 = ir1Var.m6894i(list) | ir1Var.m6894i(mq1VarM10008C) | ((i2 & 14) == 4) | ir1Var.m6894i(context) | ir1Var.m6890g(yp1VarM5366p0);
            Object objM6869O2 = ir1Var.m6869O();
            Object obj = objM6869O2;
            if (zM6894i2 || objM6869O2 == i50Var) {
                j64 j64Var = new j64(b);
                j64Var.f22054b = list;
                j64Var.f22055c = mq1VarM10008C;
                j64Var.f22056d = yp1Var;
                j64Var.f22057e = context;
                j64Var.f22058f = yp1VarM5366p0;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(j64Var);
                obj = j64Var;
            }
            AbstractC0647fd.m5668f(null, "Pick an shortcut", false, null, (yp1) obj, ir1Var, 48, 13);
        } else {
            ir1Var.m6874W();
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            gi2 gi2Var = new gi2((byte) 3);
            gi2Var.f19805c = yp1Var;
            gi2Var.f19804b = i;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = gi2Var;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final long m10097b(float f, float f2) {
        return (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    /* JADX INFO: renamed from: c */
    public static LinkedHashMap m10098c(int i) {
        int i2;
        if (i < 3) {
            i2 = i + 1;
        } else {
            i2 = i < 1073741824 ? (int) ((i / 0.75f) + 1.0f) : Integer.MAX_VALUE;
        }
        return new LinkedHashMap(i2);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m10099d(byte b) {
        return b > -65;
    }

    /* JADX INFO: renamed from: e */
    public static void m10100e(zl2 zl2Var, zq1 zq1Var, Executor executor) {
        ar1 ar1Var = new ar1((byte) 0);
        ar1Var.f14798b = zl2Var;
        ar1Var.f14799c = zq1Var;
        VarHandle.storeStoreFence();
        zl2Var.mo6454a(ar1Var, executor);
    }

    /* JADX INFO: renamed from: f */
    public static final nt2 m10101f(nt2 nt2Var, er1 er1Var) {
        C1320x6 c1320x6 = new C1320x6();
        c1320x6.f34023a = er1Var;
        VarHandle.storeStoreFence();
        return nt2Var.mo7630d(c1320x6);
    }

    /* JADX INFO: renamed from: g */
    public static final Object m10102g(float f, float f2, float f3, InterfaceC1407zj interfaceC1407zj, mq1 mq1Var, of4 of4Var) {
        sq4 sq4Var = sw4.f30612a;
        Float f4 = new Float(f);
        Float f5 = new Float(f2);
        AbstractC0654fk abstractC0654fkMo4035c = (AbstractC0654fk) sq4Var.f30508a.invoke(new Float(f3));
        if (abstractC0654fkMo4035c == null) {
            abstractC0654fkMo4035c = ((AbstractC0654fk) sq4Var.f30508a.invoke(f4)).mo4035c();
        }
        AbstractC0654fk abstractC0654fk = abstractC0654fkMo4035c;
        hi4 hi4Var = new hi4(interfaceC1407zj, sq4Var, f4, f5, abstractC0654fk);
        C0457ak c0457ak = new C0457ak(sq4Var, f4, abstractC0654fk, 56);
        cz3 cz3Var = new cz3((byte) 5);
        cz3Var.f16638b = mq1Var;
        cz3Var.f16639c = sq4Var;
        VarHandle.storeStoreFence();
        Object objM10103h = m10103h(c0457ak, hi4Var, Long.MIN_VALUE, cz3Var, of4Var);
        ap0 ap0Var = ap0.f14763a;
        ju4 ju4Var = ju4.f22634a;
        if (objM10103h != ap0Var) {
            objM10103h = ju4Var;
        }
        return objM10103h == ap0Var ? objM10103h : ju4Var;
    }

    /* JADX WARN: Code duplicated, block: B:57:0x0164  */
    /* JADX WARN: Code duplicated, block: B:60:0x0171  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX INFO: renamed from: h */
    public static final Object m10103h(C0457ak c0457ak, InterfaceC1221uj interfaceC1221uj, long j, yp1 yp1Var, ym0 ym0Var) {
        nf4 nf4Var;
        ql3 ql3Var;
        C0457ak c0457ak2;
        ql3 ql3Var2;
        InterfaceC1221uj interfaceC1221uj2;
        yp1 yp1Var2;
        Object objMo9530l;
        C1370yj c1370yj;
        C1370yj c1370yj2;
        Object objMo9530l2;
        if (ym0Var instanceof nf4) {
            nf4Var = (nf4) ym0Var;
            int i = nf4Var.f25755y;
            if ((i & Integer.MIN_VALUE) != 0) {
                nf4Var.f25755y = i - Integer.MIN_VALUE;
            } else {
                nf4Var = new nf4(ym0Var);
            }
        } else {
            nf4Var = new nf4(ym0Var);
        }
        nf4 nf4Var2 = nf4Var;
        Object obj = nf4Var2.f25754x;
        ap0 ap0Var = ap0.f14763a;
        int i2 = nf4Var2.f25755y;
        byte b = 8;
        byte b2 = 1;
        if (i2 == 0) {
            k43.m7376J(obj);
            Object objMo5813b = interfaceC1221uj.mo5813b(0L);
            AbstractC0654fk abstractC0654fkMo5817f = interfaceC1221uj.mo5817f(0L);
            ql3Var = new ql3();
            if (j == Long.MIN_VALUE) {
                try {
                    float fM10076A = m10076A(nf4Var2.getContext());
                    lf4 lf4Var = new lf4();
                    lf4Var.f24001a = ql3Var;
                    lf4Var.f24002b = objMo5813b;
                    lf4Var.f24003c = interfaceC1221uj;
                    lf4Var.f24004d = abstractC0654fkMo5817f;
                    lf4Var.f24005e = c0457ak;
                    lf4Var.f24006f = fM10076A;
                    lf4Var.f24007g = yp1Var;
                    VarHandle.storeStoreFence();
                    nf4Var2.f25750t = c0457ak;
                    nf4Var2.f25751u = interfaceC1221uj;
                    nf4Var2.f25752v = yp1Var;
                    nf4Var2.f25753w = ql3Var;
                    nf4Var2.f25755y = 1;
                    if (interfaceC1221uj.mo5812a()) {
                        objMo9530l = AbstractC0647fd.m5662T(lf4Var, nf4Var2);
                    } else {
                        C0797jg c0797jg = new C0797jg(b);
                        c0797jg.f22228b = lf4Var;
                        VarHandle.storeStoreFence();
                        objMo9530l = C0006a5.m84v(nf4Var2.getContext()).mo9530l(c0797jg, nf4Var2);
                    }
                    if (objMo9530l != ap0Var) {
                        interfaceC1221uj2 = interfaceC1221uj;
                        c0457ak2 = c0457ak;
                        yp1Var2 = yp1Var;
                    }
                } catch (CancellationException e) {
                    e = e;
                    c0457ak2 = c0457ak;
                    c1370yj = (C1370yj) ql3Var.f28555a;
                    if (c1370yj != null) {
                        c1370yj.f35259i.setValue(Boolean.FALSE);
                    }
                    c1370yj2 = (C1370yj) ql3Var.f28555a;
                    if (c1370yj2 != null) {
                        c0457ak2.f14576f = false;
                    }
                    throw e;
                }
            } else {
                try {
                    sq4 sq4VarMo5815d = interfaceC1221uj.mo5815d();
                    Object objMo5816e = interfaceC1221uj.mo5816e();
                    try {
                        a14 a14Var = new a14(b2);
                        a14Var.f54b = c0457ak;
                        VarHandle.storeStoreFence();
                        C1370yj c1370yj3 = new C1370yj(objMo5813b, sq4VarMo5815d, abstractC0654fkMo5817f, j, objMo5816e, j, a14Var);
                        ql3Var2 = ql3Var;
                        try {
                            m10114s(c1370yj3, j, m10076A(nf4Var2.getContext()), interfaceC1221uj, c0457ak, yp1Var);
                            ql3Var2.f28555a = c1370yj3;
                            c0457ak2 = c0457ak;
                            interfaceC1221uj2 = interfaceC1221uj;
                            yp1Var2 = yp1Var;
                            ql3Var = ql3Var2;
                        } catch (CancellationException e2) {
                            e = e2;
                            c0457ak2 = c0457ak;
                            ql3Var = ql3Var2;
                            c1370yj = (C1370yj) ql3Var.f28555a;
                            if (c1370yj != null) {
                                c1370yj.f35259i.setValue(Boolean.FALSE);
                            }
                            c1370yj2 = (C1370yj) ql3Var.f28555a;
                            if (c1370yj2 != null && c1370yj2.f35257g == c0457ak2.f14574d) {
                                c0457ak2.f14576f = false;
                            }
                            throw e;
                        }
                    } catch (CancellationException e3) {
                        e = e3;
                        ql3Var2 = ql3Var;
                    }
                } catch (CancellationException e4) {
                    e = e4;
                    c0457ak2 = c0457ak;
                }
            }
            return ap0Var;
        }
        if (i2 != 1 && i2 != 2) {
            C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ql3Var = nf4Var2.f25753w;
        yp1Var2 = nf4Var2.f25752v;
        interfaceC1221uj2 = nf4Var2.f25751u;
        c0457ak2 = nf4Var2.f25750t;
        try {
            k43.m7376J(obj);
        } catch (CancellationException e5) {
            e = e5;
            c1370yj = (C1370yj) ql3Var.f28555a;
            if (c1370yj != null) {
                c1370yj.f35259i.setValue(Boolean.FALSE);
            }
            c1370yj2 = (C1370yj) ql3Var.f28555a;
            if (c1370yj2 != null) {
                c0457ak2.f14576f = false;
            }
            throw e;
        }
        while (((Boolean) ((C1370yj) ql3Var.f28555a).f35259i.getValue()).booleanValue()) {
            float fM10076A2 = m10076A(nf4Var2.getContext());
            mf4 mf4Var = new mf4();
            mf4Var.f24862a = ql3Var;
            mf4Var.f24863b = fM10076A2;
            mf4Var.f24864c = interfaceC1221uj2;
            mf4Var.f24865d = c0457ak2;
            mf4Var.f24866e = yp1Var2;
            VarHandle.storeStoreFence();
            nf4Var2.f25750t = c0457ak2;
            nf4Var2.f25751u = interfaceC1221uj2;
            nf4Var2.f25752v = yp1Var2;
            nf4Var2.f25753w = ql3Var;
            nf4Var2.f25755y = 2;
            if (interfaceC1221uj2.mo5812a()) {
                objMo9530l2 = AbstractC0647fd.m5662T(mf4Var, nf4Var2);
            } else {
                C0797jg c0797jg2 = new C0797jg(b);
                c0797jg2.f22228b = mf4Var;
                VarHandle.storeStoreFence();
                objMo9530l2 = C0006a5.m84v(nf4Var2.getContext()).mo9530l(c0797jg2, nf4Var2);
            }
            if (objMo9530l2 == ap0Var) {
                return ap0Var;
            }
        }
        return ju4.f22634a;
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ Object m10104i(float f, float f2, InterfaceC1407zj interfaceC1407zj, mq1 mq1Var, of4 of4Var, int i) {
        if ((i & 8) != 0) {
            interfaceC1407zj = qq2.m10014I(0.0f, 0.0f, null, 7);
        }
        return m10102g(f, f2, 0.0f, interfaceC1407zj, mq1Var, of4Var);
    }

    /* JADX INFO: renamed from: j */
    public static final Object m10105j(C0457ak c0457ak, gv0 gv0Var, boolean z, yp1 yp1Var, ym0 ym0Var) {
        Object value = c0457ak.f14572b.getValue();
        AbstractC0654fk abstractC0654fk = c0457ak.f14573c;
        sq4 sq4Var = c0457ak.f14571a;
        ii1 ii1Var = gv0Var.f20145a;
        cx4 cx4Var = new cx4();
        cx4Var.f16581a = ii1Var;
        cx4Var.f16585e = ii1Var.mo5960c();
        VarHandle.storeStoreFence();
        fv0 fv0Var = new fv0();
        fv0Var.f19331b = cx4Var;
        fv0Var.f19332c = sq4Var;
        fv0Var.f19333d = value;
        AbstractC0654fk abstractC0654fk2 = (AbstractC0654fk) sq4Var.f30508a.invoke(value);
        fv0Var.f19335f = abstractC0654fk2;
        fv0Var.f19336g = sj3.m10824t(abstractC0654fk);
        yp1 yp1Var2 = sq4Var.f30509b;
        AbstractC0654fk abstractC0654fkMo4035c = cx4Var.f16584d;
        if (abstractC0654fkMo4035c == null) {
            abstractC0654fkMo4035c = abstractC0654fk2.mo4035c();
            cx4Var.f16584d = abstractC0654fkMo4035c;
        }
        int iMo4034b = abstractC0654fkMo4035c.mo4034b();
        int i = 0;
        while (true) {
            AbstractC0654fk abstractC0654fk3 = cx4Var.f16584d;
            if (i >= iMo4034b) {
                if (abstractC0654fk3 == null) {
                    z62.m13366Y("targetVector");
                    throw null;
                }
                fv0Var.f19334e = yp1Var2.invoke(abstractC0654fk3);
                AbstractC0654fk abstractC0654fkMo4035c2 = cx4Var.f16583c;
                if (abstractC0654fkMo4035c2 == null) {
                    abstractC0654fkMo4035c2 = abstractC0654fk2.mo4035c();
                    cx4Var.f16583c = abstractC0654fkMo4035c2;
                }
                int iMo4034b2 = abstractC0654fkMo4035c2.mo4034b();
                long jMax = 0;
                for (int i2 = 0; i2 < iMo4034b2; i2++) {
                    ii1 ii1Var2 = cx4Var.f16581a;
                    abstractC0654fk2.getClass();
                    jMax = Math.max(jMax, ii1Var2.mo5958a(abstractC0654fk.mo3608a(i2)));
                }
                fv0Var.f19330a = jMax;
                AbstractC0654fk abstractC0654fkM10824t = sj3.m10824t(cx4Var.m4227a(jMax, (AbstractC0654fk) fv0Var.f19335f, abstractC0654fk));
                fv0Var.f19337h = abstractC0654fkM10824t;
                int iMo4034b3 = abstractC0654fkM10824t.mo4034b();
                for (int i3 = 0; i3 < iMo4034b3; i3++) {
                    AbstractC0654fk abstractC0654fk4 = (AbstractC0654fk) fv0Var.f19337h;
                    float fMo3608a = abstractC0654fk4.mo3608a(i3);
                    float f = cx4Var.f16585e;
                    abstractC0654fk4.mo3610e(sc6.m10674o(fMo3608a, -f, f), i3);
                }
                VarHandle.storeStoreFence();
                Object objM10103h = m10103h(c0457ak, fv0Var, z ? c0457ak.f14574d : Long.MIN_VALUE, yp1Var, ym0Var);
                return objM10103h == ap0.f14763a ? objM10103h : ju4.f22634a;
            }
            if (abstractC0654fk3 == null) {
                z62.m13366Y("targetVector");
                throw null;
            }
            abstractC0654fk3.mo3610e(cx4Var.f16581a.mo5961f(abstractC0654fk2.mo3608a(i), abstractC0654fk.mo3608a(i)), i);
            i++;
        }
    }

    /* JADX INFO: renamed from: k */
    public static final Object m10106k(C0457ak c0457ak, Float f, InterfaceC1407zj interfaceC1407zj, boolean z, yp1 yp1Var, ym0 ym0Var) {
        Object objM10103h = m10103h(c0457ak, new hi4(interfaceC1407zj, c0457ak.f14571a, c0457ak.f14572b.getValue(), f, c0457ak.f14573c), z ? c0457ak.f14574d : Long.MIN_VALUE, yp1Var, ym0Var);
        return objM10103h == ap0.f14763a ? objM10103h : ju4.f22634a;
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ Object m10107l(C0457ak c0457ak, Float f, InterfaceC1407zj interfaceC1407zj, C0531cl c0531cl, ym0 ym0Var, int i) {
        boolean z = (i & 4) == 0;
        yp1 r54Var = c0531cl;
        if ((i & 8) != 0) {
            r54Var = new r54((byte) 7);
        }
        return m10106k(c0457ak, f, interfaceC1407zj, z, r54Var, ym0Var);
    }

    /* JADX INFO: renamed from: m */
    public static List m10108m(int i) {
        return i == 0 ? Collections.EMPTY_LIST : new ArrayList(i);
    }

    /* JADX INFO: renamed from: n */
    public static Type m10109n(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            return cls.isArray() ? new pu1(m10109n(cls.getComponentType())) : cls;
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new qu1(parameterizedType.getOwnerType(), (Class) parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            return new pu1(((GenericArrayType) type).getGenericComponentType());
        }
        if (!(type instanceof WildcardType)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        return new ru1(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
    }

    /* JADX INFO: renamed from: o */
    public static void m10110o(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            C1077qn.m9987m("Primitive type is not allowed");
        }
    }

    /* JADX INFO: renamed from: p */
    public static int m10111p(Comparable comparable, Comparable comparable2) {
        if (comparable == null) {
            return comparable2 == null ? 0 : -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    /* JADX INFO: renamed from: q */
    public static final int m10112q(char c) {
        if ('0' <= c && c < ':') {
            return c - '0';
        }
        if ('a' <= c && c < 'g') {
            return c - 'W';
        }
        if ('A' <= c && c < 'G') {
            return c - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c);
    }

    /* JADX INFO: renamed from: r */
    public static double m10113r(double[] dArr, double[] dArr2) {
        double d = dArr[0] - dArr2[0];
        double d2 = dArr[1] - dArr2[1];
        double d3 = dArr[2] - dArr2[2];
        return (d3 * d3) + (d2 * d2) + (d * d);
    }

    /* JADX INFO: renamed from: s */
    public static final void m10114s(C1370yj c1370yj, long j, float f, InterfaceC1221uj interfaceC1221uj, C0457ak c0457ak, yp1 yp1Var) {
        long jMo5814c = f == 0.0f ? interfaceC1221uj.mo5814c() : (long) ((j - c1370yj.f35253c) / f);
        c1370yj.f35257g = j;
        c1370yj.f35255e.setValue(interfaceC1221uj.mo5813b(jMo5814c));
        c1370yj.f35256f = interfaceC1221uj.mo5817f(jMo5814c);
        if (interfaceC1221uj.m11569g(jMo5814c)) {
            c1370yj.f35258h = c1370yj.f35257g;
            c1370yj.f35259i.setValue(Boolean.FALSE);
        }
        m10094S(c1370yj, c0457ak);
        yp1Var.invoke(c1370yj);
    }

    /* JADX INFO: renamed from: t */
    public static final void m10115t(yu2 yu2Var, h70 h70Var, t30 t30Var, float f, m44 m44Var, uj4 uj4Var, qq2 qq2Var) {
        ArrayList arrayList = yu2Var.f35539h;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            n73 n73Var = (n73) arrayList.get(i);
            n73Var.f25497a.m12678f(h70Var, t30Var, f, m44Var, uj4Var, qq2Var);
            h70Var.mo6249e(0.0f, n73Var.f25497a.f34187e);
        }
    }

    /* JADX INFO: renamed from: u */
    public static boolean m10116u(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX INFO: renamed from: v */
    public static boolean m10117v(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            return Objects.equals(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof GenericArrayType) {
                return m10117v(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return false;
        }
        if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
        }
        if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) type;
        TypeVariable typeVariable2 = (TypeVariable) type2;
        return Objects.equals(typeVariable.getGenericDeclaration(), typeVariable2.getGenericDeclaration()) && typeVariable.getName().equals(typeVariable2.getName());
    }

    /* JADX INFO: renamed from: w */
    public static final ea3 m10118w(Context context, Intent intent) throws PackageManager.NameNotFoundException {
        Intent intent2 = (Intent) intent.getParcelableExtra("android.intent.extra.shortcut.INTENT");
        String stringExtra = intent.getStringExtra("android.intent.extra.shortcut.NAME");
        Bitmap bitmapM7377K = (Bitmap) intent.getParcelableExtra("android.intent.extra.shortcut.ICON");
        Intent.ShortcutIconResource shortcutIconResource = (Intent.ShortcutIconResource) intent.getParcelableExtra("android.intent.extra.shortcut.ICON_RESOURCE");
        if (bitmapM7377K == null) {
            if (shortcutIconResource == null) {
                nm0.m8798k(intent, "No icon provided ");
                return null;
            }
            Resources resourcesForApplication = context.getPackageManager().getResourcesForApplication(shortcutIconResource.packageName);
            bitmapM7377K = k43.m7377K(resourcesForApplication.getDrawable(resourcesForApplication.getIdentifier(shortcutIconResource.resourceName, null, null)));
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmapM7377K.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        String uri = intent2.toUri(0);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        ea3 ea3Var = new ea3();
        ea3Var.f17927a = stringExtra;
        ea3Var.f17928b = uri;
        ea3Var.f17929c = byteArray;
        VarHandle.storeStoreFence();
        return ea3Var;
    }

    /* JADX INFO: renamed from: x */
    public static final so0 m10119x(Executor executor) {
        so0 so0Var;
        j01 j01Var = executor instanceof j01 ? (j01) executor : null;
        return (j01Var == null || (so0Var = j01Var.f21923a) == null) ? new ub1(executor) : so0Var;
    }

    /* JADX INFO: renamed from: y */
    public static r60 m10120y(int i) {
        int i2;
        int i3;
        int i4;
        sy4 sy4Var = sy4.f30661k;
        double dM10641M = sc6.m10641M((16711680 & i) >> 16);
        double dM10641M2 = sc6.m10641M((65280 & i) >> 8);
        double dM10641M3 = sc6.m10641M(i & 255);
        double d = (0.18051042d * dM10641M3) + (0.35762064d * dM10641M2) + (0.41233895d * dM10641M);
        double d2 = (0.0722d * dM10641M3) + (0.7152d * dM10641M2) + (0.2126d * dM10641M);
        double d3 = (dM10641M3 * 0.95034478d) + (dM10641M2 * 0.11916382d) + (dM10641M * 0.01932141d);
        double d4 = sy4Var.f30670i;
        double d5 = sy4Var.f30666e;
        double d6 = sy4Var.f30663b;
        double[][] dArr = r60.f29038f;
        double[] dArr2 = dArr[0];
        double d7 = (dArr2[2] * d3) + (dArr2[1] * d2) + (dArr2[0] * d);
        double[] dArr3 = dArr[1];
        double d8 = (dArr3[2] * d3) + (dArr3[1] * d2) + (dArr3[0] * d);
        double[] dArr4 = dArr[2];
        double d9 = (d3 * dArr4[2]) + (d2 * dArr4[1]) + (d * dArr4[0]);
        double[] dArr5 = sy4Var.f30668g;
        double d10 = dArr5[0] * d7;
        double d11 = dArr5[1] * d8;
        double d12 = dArr5[2] * d9;
        double d13 = sy4Var.f30669h;
        double dPow = Math.pow((Math.abs(d10) * d13) / 100.0d, 0.42d);
        double dPow2 = Math.pow((Math.abs(d11) * d13) / 100.0d, 0.42d);
        double dPow3 = Math.pow((Math.abs(d12) * d13) / 100.0d, 0.42d);
        if (d10 < 0.0d) {
            i2 = -1;
        } else {
            i2 = d10 == 0.0d ? 0 : 1;
        }
        double d14 = ((((double) i2) * 400.0d) * dPow) / (dPow + 27.13d);
        if (d11 < r6) {
            i3 = -1;
        } else {
            i3 = d11 == r6 ? 0 : 1;
        }
        double d15 = ((((double) i3) * 400.0d) * dPow2) / (dPow2 + 27.13d);
        if (d12 < r6) {
            i4 = -1;
        } else {
            i4 = d12 == r6 ? 0 : 1;
        }
        double d16 = ((((double) i4) * 400.0d) * dPow3) / (dPow3 + 27.13d);
        double d17 = ((((-12.0d) * d15) + (d14 * 11.0d)) + d16) / 11.0d;
        double dM4361f = d55.m4361f(d16, 2.0d, d14 + d15, 9.0d);
        double d18 = d15 * 20.0d;
        double d19 = ((21.0d * d16) + ((d14 * 20.0d) + d18)) / 20.0d;
        double d20 = (((d14 * 40.0d) + d18) + d16) / 20.0d;
        double dAtan2 = (Math.atan2(dM4361f, d17) * 57.29577951308232d) % 360.0d;
        if (dAtan2 < 0) {
            dAtan2 += 360.0d;
        }
        double d21 = dAtan2 * 0.017453292519943295d;
        double dPow4 = Math.pow((d20 * sy4Var.f30664c) / d6, sy4Var.f30671j * d5) * 100.0d;
        double d22 = dPow4 / 100.0d;
        Math.sqrt(d22);
        double d23 = d6 + 4.0d;
        double dPow5 = Math.pow((Math.hypot(d17, dM4361f) * (((((Math.cos(((dAtan2 < 20.14d ? dAtan2 + 360.0d : dAtan2) * 0.017453292519943295d) + 2.0d) + 3.8d) * 0.25d) * 3846.153846153846d) * sy4Var.f30667f) * sy4Var.f30665d)) / (d19 + 0.305d), 0.9d) * Math.pow(1.64d - Math.pow(0.29d, sy4Var.f30662a), 0.73d);
        double dSqrt = Math.sqrt(d22) * dPow5;
        double d24 = dSqrt * d4;
        Math.sqrt((dPow5 * d5) / d23);
        double d25 = (1.7000000000000002d * dPow4) / ((0.007d * dPow4) + 1.0d);
        double dLog1p = Math.log1p(d24 * 0.0228d) * 43.859649122807014d;
        double dCos = Math.cos(d21) * dLog1p;
        double dSin = Math.sin(d21) * dLog1p;
        r60 r60Var = new r60();
        r60Var.f29040a = dAtan2;
        r60Var.f29041b = dSqrt;
        r60Var.f29042c = d25;
        r60Var.f29043d = dCos;
        r60Var.f29044e = dSin;
        VarHandle.storeStoreFence();
        return r60Var;
    }

    /* JADX INFO: renamed from: z */
    public static Object m10121z(Future future) {
        Object obj;
        if (!future.isDone()) {
            C1077qn.m9989o(sc6.m10639K("Future was expected to be done: %s", future));
            return null;
        }
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }
}
