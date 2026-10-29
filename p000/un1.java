package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import essentials.app.EsActivity;
import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class un1 implements LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: a */
    public eo1 f32011a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [eo1] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.lang.Object, pn1] */
    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Object, pn1] */
    /* JADX WARN: Type inference failed for: r5v16, types: [pn1] */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v23, types: [pn1] */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r5v43 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean zIsAssignableFrom;
        ?? M5219C;
        View view2;
        lo1 lo1VarM5249h;
        ?? r5;
        pn1 pn1VarM5219C;
        String str2;
        ?? r2 = this.f32011a;
        C1283w7 c1283w7 = r2.f18306c;
        int id = 0;
        View view3 = null;
        if (tn1.class.getName().equals(str)) {
            tn1 tn1Var = new tn1(context, attributeSet);
            tn1Var.f31256a = new ArrayList();
            tn1Var.f31257b = new ArrayList();
            tn1Var.f31259d = true;
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, cj3.f16066b, 0, 0);
            if (classAttribute == null) {
                classAttribute = typedArrayObtainStyledAttributes.getString(0);
            }
            String string = typedArrayObtainStyledAttributes.getString(1);
            typedArrayObtainStyledAttributes.recycle();
            int id2 = tn1Var.getId();
            pn1 pn1VarM5219C2 = r2.m5219C(id2);
            if (classAttribute != null && pn1VarM5219C2 == null) {
                if (id2 == -1) {
                    if (string != null) {
                        str2 = " with tag " + ((Object) string);
                    } else {
                        str2 = "";
                    }
                    wb1.m12192k("FragmentContainerView must have an android:id to add Fragment ", classAttribute, str2);
                    return null;
                }
                yn1 yn1VarM5222G = r2.m5222G();
                context.getClassLoader();
                pn1 pn1VarM13180a = yn1VarM5222G.m13180a(classAttribute);
                pn1VarM13180a.f27801x = id2;
                pn1VarM13180a.f27802y = id2;
                pn1VarM13180a.f27803z = string;
                pn1VarM13180a.f27797t = r2;
                rn1 rn1Var = r2.f18326w;
                pn1VarM13180a.f27798u = rn1Var;
                pn1VarM13180a.f27760E = true;
                if ((rn1Var == null ? null : rn1Var.f29430u) != null) {
                    pn1VarM13180a.f27760E = true;
                }
                C0589dw c0589dw = new C0589dw(r2);
                c0589dw.f17448o = true;
                pn1VarM13180a.f27761F = tn1Var;
                pn1VarM13180a.f27793p = true;
                c0589dw.m4770f(tn1Var.getId(), pn1VarM13180a, string);
                if (c0589dw.f17440g) {
                    C1077qn.m9989o("This transaction is already being added to the back stack");
                    return null;
                }
                eo1 eo1Var = c0589dw.f17450q;
                if (eo1Var.f18326w != null && !eo1Var.f18297J) {
                    eo1Var.m5267z(true);
                    C0589dw c0589dw2 = eo1Var.f18311h;
                    if (c0589dw2 != null) {
                        c0589dw2.f17451r = false;
                        c0589dw2.m4768d();
                        if (eo1.m5212J(3)) {
                            Log.d("FragmentManager", "Reversing mTransitioningOp " + eo1Var.f18311h + " as part of execSingleAction for action " + c0589dw);
                        }
                        eo1Var.f18311h.m4769e(false, false);
                        eo1Var.f18311h.mo3642a(eo1Var.f18299L, eo1Var.f18300M);
                        ArrayList arrayList = eo1Var.f18311h.f17434a;
                        int size = arrayList.size();
                        int i = 0;
                        while (i < size) {
                            Object obj = arrayList.get(i);
                            i++;
                            pn1 pn1Var = ((po1) obj).f27852b;
                            if (pn1Var != null) {
                                pn1Var.f27790m = false;
                            }
                        }
                        eo1Var.f18311h = null;
                    }
                    c0589dw.mo3642a(eo1Var.f18299L, eo1Var.f18300M);
                    eo1Var.f18305b = true;
                    try {
                        eo1Var.m5231T(eo1Var.f18299L, eo1Var.f18300M);
                        eo1Var.m5245e();
                        eo1Var.m5246e0();
                        if (eo1Var.f18298K) {
                            eo1Var.f18298K = false;
                            eo1Var.m5242c0();
                        }
                        ((HashMap) eo1Var.f18306c.f33128d).values().removeAll(Collections.singleton(null));
                    } catch (Throwable th) {
                        eo1Var.m5245e();
                        throw th;
                    }
                }
            }
            ArrayList arrayListM12117D = c1283w7.m12117D();
            int size2 = arrayListM12117D.size();
            while (id < size2) {
                Object obj2 = arrayListM12117D.get(id);
                id++;
                int i2 = ((lo1) obj2).f24224c.f27802y;
                tn1Var.getId();
            }
            VarHandle.storeStoreFence();
            return tn1Var;
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, cj3.f16065a);
            if (attributeValue == null) {
                attributeValue = typedArrayObtainStyledAttributes2.getString(0);
            }
            int resourceId = typedArrayObtainStyledAttributes2.getResourceId(1, -1);
            String string2 = typedArrayObtainStyledAttributes2.getString(2);
            typedArrayObtainStyledAttributes2.recycle();
            if (attributeValue != null) {
                try {
                    zIsAssignableFrom = pn1.class.isAssignableFrom(yn1.m13178b(context.getClassLoader(), attributeValue));
                } catch (ClassNotFoundException unused) {
                    zIsAssignableFrom = false;
                }
                if (zIsAssignableFrom) {
                    id = view != null ? view.getId() : 0;
                    if (id == -1 && resourceId == -1 && string2 == null) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                    }
                    if (resourceId != -1) {
                        pn1VarM5219C = r2.m5219C(resourceId);
                    } else {
                        M5219C = 0;
                    }
                    if (M5219C == 0 && string2 != null) {
                        ArrayList arrayList2 = (ArrayList) c1283w7.f33127c;
                        int size3 = arrayList2.size() - 1;
                        while (true) {
                            if (size3 < 0) {
                                view2 = view3;
                                Iterator it = ((HashMap) c1283w7.f33128d).values().iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        M5219C = view2;
                                        break;
                                    }
                                    lo1 lo1Var = (lo1) it.next();
                                    if (lo1Var != null) {
                                        M5219C = lo1Var.f24224c;
                                        if (string2.equals(M5219C.f27803z)) {
                                            break;
                                        }
                                    }
                                }
                            } else {
                                pn1 pn1Var2 = (pn1) arrayList2.get(size3);
                                view2 = view3;
                                if (pn1Var2 != null && string2.equals(pn1Var2.f27803z)) {
                                    M5219C = pn1Var2;
                                    break;
                                }
                                size3--;
                                view3 = view2;
                            }
                        }
                    } else {
                        M5219C = pn1VarM5219C;
                        view2 = null;
                    }
                    if (M5219C == 0 && id != -1) {
                        M5219C = r2.m5219C(id);
                    }
                    if (M5219C == 0) {
                        yn1 yn1VarM5222G2 = r2.m5222G();
                        context.getClassLoader();
                        pn1 pn1VarM13180a2 = yn1VarM5222G2.m13180a(attributeValue);
                        pn1VarM13180a2.f27791n = true;
                        pn1VarM13180a2.f27801x = resourceId != 0 ? resourceId : id;
                        pn1VarM13180a2.f27802y = id;
                        pn1VarM13180a2.f27803z = string2;
                        pn1VarM13180a2.f27792o = true;
                        pn1VarM13180a2.f27797t = r2;
                        rn1 rn1Var2 = r2.f18326w;
                        pn1VarM13180a2.f27798u = rn1Var2;
                        EsActivity esActivity = rn1Var2.f29431v;
                        pn1VarM13180a2.f27760E = true;
                        if ((rn1Var2 == null ? view2 : rn1Var2.f29430u) != null) {
                            pn1VarM13180a2.f27760E = true;
                        }
                        lo1VarM5249h = r2.m5238a(pn1VarM13180a2);
                        r5 = pn1VarM13180a2;
                        if (eo1.m5212J(2)) {
                            Log.v("FragmentManager", "Fragment " + pn1VarM13180a2 + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                            r5 = pn1VarM13180a2;
                        }
                    } else {
                        if (M5219C.f27792o) {
                            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string2 + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                        }
                        M5219C.f27792o = true;
                        M5219C.f27797t = r2;
                        rn1 rn1Var3 = r2.f18326w;
                        M5219C.f27798u = rn1Var3;
                        EsActivity esActivity2 = rn1Var3.f29431v;
                        M5219C.f27760E = true;
                        if ((rn1Var3 == null ? view2 : rn1Var3.f29430u) != null) {
                            M5219C.f27760E = true;
                        }
                        lo1VarM5249h = r2.m5249h(M5219C);
                        r5 = M5219C;
                        if (eo1.m5212J(2)) {
                            Log.v("FragmentManager", "Retained Fragment " + M5219C + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                            r5 = M5219C;
                        }
                    }
                    ViewGroup viewGroup = (ViewGroup) view;
                    no1 no1Var = oo1.f26923a;
                    oo1.m9219b(new jo1(r5, "Attempting to use <fragment> tag to add fragment " + r5 + " to container " + viewGroup));
                    oo1.m9218a(r5).getClass();
                    mo1[] mo1VarArr = mo1.f25080a;
                    r5.f27761F = viewGroup;
                    lo1VarM5249h.m8053j();
                    lo1VarM5249h.m8052i();
                    C1077qn.m9989o(zi4.m13621u("Fragment ", attributeValue, " did not create a view."));
                    return view2;
                }
            }
        }
        return null;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
