package p000;

import android.accessibilityservice.AccessibilityService;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class jx3 extends of4 implements mq1 {

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ AccessibilityService f22716A;

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ AccessibilityNodeInfo f22717B;

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ xn2 f22718C;

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ si1 f22719D;

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ ml3 f22720E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ ml3 f22721F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ ol3 f22722G;

    /* JADX INFO: renamed from: t */
    public DisplayMetrics f22723t;

    /* JADX INFO: renamed from: u */
    public Rect f22724u;

    /* JADX INFO: renamed from: v */
    public int f22725v;

    /* JADX INFO: renamed from: w */
    public int f22726w;

    /* JADX INFO: renamed from: x */
    public float f22727x;

    /* JADX INFO: renamed from: y */
    public boolean f22728y;

    /* JADX INFO: renamed from: z */
    public byte f22729z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jx3(AccessibilityService accessibilityService, AccessibilityNodeInfo accessibilityNodeInfo, xn2 xn2Var, si1 si1Var, ml3 ml3Var, ml3 ml3Var2, ol3 ol3Var, wm0 wm0Var) {
        super(2, wm0Var);
        this.f22716A = accessibilityService;
        this.f22717B = accessibilityNodeInfo;
        this.f22718C = xn2Var;
        this.f22719D = si1Var;
        this.f22720E = ml3Var;
        this.f22721F = ml3Var2;
        this.f22722G = ol3Var;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        return new jx3(this.f22716A, this.f22717B, this.f22718C, this.f22719D, this.f22720E, this.f22721F, this.f22722G, wm0Var);
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        return ((jx3) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4.f22634a);
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0333  */
    /* JADX WARN: Code duplicated, block: B:106:0x0345  */
    /* JADX WARN: Code duplicated, block: B:108:0x0362  */
    /* JADX WARN: Code duplicated, block: B:110:0x0374  */
    /* JADX WARN: Code duplicated, block: B:111:0x0381  */
    /* JADX WARN: Code duplicated, block: B:18:0x00b7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:21:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:22:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:25:0x00e6 A[PHI: r0 r2 r7 r10 r11 r12
  0x00e6: PHI (r0v37 android.util.DisplayMetrics) = (r0v4 android.util.DisplayMetrics), (r0v43 android.util.DisplayMetrics) binds: [B:14:0x009c, B:23:0x00e2] A[DONT_GENERATE, DONT_INLINE]
  0x00e6: PHI (r2v29 java.lang.Object) = (r2v0 java.lang.Object), (r2v37 java.lang.Object) binds: [B:14:0x009c, B:23:0x00e2] A[DONT_GENERATE, DONT_INLINE]
  0x00e6: PHI (r7v15 ml3) = (r7v0 ml3), (r7v16 ml3) binds: [B:14:0x009c, B:23:0x00e2] A[DONT_GENERATE, DONT_INLINE]
  0x00e6: PHI (r10v13 java.lang.String) = (r10v0 java.lang.String), (r10v14 java.lang.String) binds: [B:14:0x009c, B:23:0x00e2] A[DONT_GENERATE, DONT_INLINE]
  0x00e6: PHI (r11v13 android.view.accessibility.AccessibilityNodeInfo) = (r11v0 android.view.accessibility.AccessibilityNodeInfo), (r11v15 android.view.accessibility.AccessibilityNodeInfo) binds: [B:14:0x009c, B:23:0x00e2] A[DONT_GENERATE, DONT_INLINE]
  0x00e6: PHI (r12v24 byte) = (r12v0 byte), (r12v28 byte) binds: [B:14:0x009c, B:23:0x00e2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:27:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:28:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:30:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:32:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:41:0x0126  */
    /* JADX WARN: Code duplicated, block: B:42:0x012a  */
    /* JADX WARN: Code duplicated, block: B:44:0x0144  */
    /* JADX WARN: Code duplicated, block: B:46:0x0156  */
    /* JADX WARN: Code duplicated, block: B:47:0x016b  */
    /* JADX WARN: Code duplicated, block: B:49:0x016f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0182  */
    /* JADX WARN: Code duplicated, block: B:65:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:70:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:80:0x0274  */
    /* JADX WARN: Code duplicated, block: B:83:0x0281  */
    /* JADX WARN: Code duplicated, block: B:85:0x0293  */
    /* JADX WARN: Code duplicated, block: B:86:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:89:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:92:0x02db  */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x038f, code lost:
    
        if (r0 == r6) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0191, code lost:
    
        if (r1 == r6) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x02f8, code lost:
    
        if (r1 == r6) goto L114;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:106:0x0345, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:46:0x0156, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:85:0x0293, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v32, types: [android.graphics.Rect, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v36 */
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
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:94:0x02f8 -> B:96:0x02fc). Please report as a decompilation issue!!! */
    @Override // p000.AbstractC0888lx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        DisplayMetrics displayMetrics;
        Object objM7901I;
        Object objM9325d;
        int i;
        DisplayMetrics displayMetrics2;
        Object objM7901I2;
        int i2;
        int i3;
        Object objM7901I3;
        Rect rect;
        DisplayMetrics displayMetrics3;
        Object objM7901I4;
        int i4;
        int i5;
        int i6;
        DisplayMetrics displayMetrics4;
        ml3 ml3Var;
        Rect rect2;
        float f;
        Object objM9327f;
        int i7;
        boolean z;
        int i8;
        float f2;
        DisplayMetrics displayMetrics5;
        String str;
        Object objM7901I5;
        boolean zBooleanValue;
        Rect rect3;
        String strM12721a;
        k44 k44Var;
        int i9;
        float fExactCenterX;
        int i10;
        int i11;
        Rect rect4;
        String str2;
        String strM12721a2;
        k44 k44Var2;
        int i12;
        List<AccessibilityNodeInfo.AccessibilityAction> actionList;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction;
        boolean zPerformAction;
        String strM12721a3;
        k44 k44Var3;
        long j;
        String str3;
        DisplayMetrics displayMetrics6;
        String strM12721a4;
        k44 k44Var4;
        String strM12721a5;
        k44 k44Var5;
        ap0 ap0Var = ap0.f14763a;
        byte b = this.f22729z;
        ml3 ml3Var2 = this.f22721F;
        ml3 ml3Var3 = this.f22720E;
        String str4 = "fling ";
        AccessibilityNodeInfo accessibilityNodeInfo = this.f22717B;
        byte b2 = 1;
        si1 si1Var = this.f22719D;
        ol3 ol3Var = this.f22722G;
        xn2 xn2Var = this.f22718C;
        ?? r1 = 0;
        switch (b) {
            case 0:
                k43.m7376J(obj);
                displayMetrics = this.f22716A.getResources().getDisplayMetrics();
                if (accessibilityNodeInfo.refresh()) {
                    this.f22723t = displayMetrics;
                    this.f22724u = r1;
                    this.f22729z = b2;
                    objM7901I = lb5.m7901I(si1Var, this);
                    if (objM7901I != ap0Var) {
                        if (((ux3) objM7901I).f32235c == 0) {
                            i11 = b2;
                        } else {
                            i11 = 0;
                        }
                        if (i11 == 0 || ox3.m9326e(accessibilityNodeInfo) == null) {
                            AccessibilityNodeInfo accessibilityNodeInfo2 = accessibilityNodeInfo;
                            str3 = str4;
                            if (xn2Var != 0) {
                                strM12721a4 = xn2Var.m12721a();
                                k44Var4 = k44.f22883b;
                                if (xn2Var.f34459a.m8274a().compareTo(k44Var4) <= 0) {
                                    displayMetrics6 = null;
                                    xn2Var.m12722b(k44Var4, strM12721a4, c75.m3878j(str3, ol3Var.f26851a, ": near top, finishing with page actions"), null);
                                } else {
                                    displayMetrics6 = null;
                                }
                            } else {
                                displayMetrics6 = null;
                            }
                            this.f22723t = displayMetrics6;
                            this.f22725v = i11;
                            this.f22729z = (byte) 2;
                            objM9325d = ox3.m9325d(accessibilityNodeInfo2, xn2Var, this);
                        } else if (ml3Var2.f25002a) {
                            this.f22723t = displayMetrics;
                            this.f22725v = i11;
                            this.f22729z = (byte) 3;
                            objM7901I2 = lb5.m7901I(si1Var, this);
                            if (objM7901I2 != ap0Var) {
                                int i13 = i11;
                                displayMetrics2 = displayMetrics;
                                i = i13;
                                i12 = ((ux3) objM7901I2).f32233a;
                                int i14 = ox3.f27193g;
                                actionList = accessibilityNodeInfo.getActionList();
                                accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION;
                                if (actionList.contains(accessibilityAction)) {
                                    int id = accessibilityAction.getId();
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("android.view.accessibility.action.ARGUMENT_ROW_INT", 0);
                                    bundle.putInt("android.view.accessibility.action.ARGUMENT_COLUMN_INT", 0);
                                    zPerformAction = accessibilityNodeInfo.performAction(id, bundle);
                                    if (xn2Var != 0) {
                                        strM12721a3 = xn2Var.m12721a();
                                        k44Var3 = k44.f22883b;
                                        if (xn2Var.f34459a.m8274a().compareTo(k44Var3) <= 0) {
                                            xn2Var.m12722b(k44Var3, strM12721a3, "fast path: performAction = " + zPerformAction, null);
                                        }
                                    }
                                } else {
                                    zPerformAction = false;
                                }
                                if (zPerformAction) {
                                    DisplayMetrics displayMetrics7 = displayMetrics2;
                                    i11 = i;
                                    displayMetrics = displayMetrics7;
                                    rect4 = new Rect();
                                    accessibilityNodeInfo.getBoundsInScreen(rect4);
                                    rect4.intersect(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
                                    if (rect4.height() < 200 && rect4.width() >= 50) {
                                        this.f22723t = displayMetrics;
                                        this.f22724u = rect4;
                                        this.f22725v = i11;
                                        this.f22729z = (byte) 6;
                                        objM7901I4 = lb5.m7901I(si1Var, this);
                                        if (objM7901I4 != ap0Var) {
                                            displayMetrics3 = displayMetrics;
                                            i4 = i11;
                                            rect = rect4;
                                            i9 = ((ux3) objM7901I4).f32233a;
                                            fExactCenterX = rect.exactCenterX();
                                            i10 = i4;
                                            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits((rect.height() * 0.2f) + rect.top)) & 4294967295L) | (Float.floatToRawIntBits(fExactCenterX) << 32);
                                            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fExactCenterX)) << 32) | (((long) Float.floatToRawIntBits((rect.height() * 0.85f) + rect.top)) & 4294967295L);
                                            this.f22723t = displayMetrics3;
                                            this.f22724u = null;
                                            this.f22725v = i10;
                                            this.f22726w = i9;
                                            this.f22727x = fExactCenterX;
                                            this.f22729z = (byte) 7;
                                            ml3Var = ml3Var2;
                                            rect2 = null;
                                            objM9327f = ox3.m9327f(this.f22716A, jFloatToRawIntBits, jFloatToRawIntBits2, this);
                                            if (objM9327f != ap0Var) {
                                                i6 = i10;
                                                i5 = i9;
                                                displayMetrics4 = displayMetrics3;
                                                f = fExactCenterX;
                                                zBooleanValue = ((Boolean) objM9327f).booleanValue();
                                                if (xn2Var != 0) {
                                                    strM12721a = xn2Var.m12721a();
                                                    k44Var = k44.f22883b;
                                                    if (xn2Var.f34459a.m8274a().compareTo(k44Var) <= 0) {
                                                        str = str4;
                                                        rect3 = null;
                                                        xn2Var.m12722b(k44Var, strM12721a, str + ol3Var.f26851a + ": swipe completed=" + zBooleanValue, null);
                                                    } else {
                                                        rect3 = rect2;
                                                        str = str4;
                                                    }
                                                } else {
                                                    rect3 = rect2;
                                                    str = str4;
                                                }
                                                if (zBooleanValue) {
                                                    ol3Var.f26851a++;
                                                    this.f22723t = displayMetrics4;
                                                    this.f22724u = rect3;
                                                    this.f22725v = i6;
                                                    this.f22726w = i5;
                                                    this.f22727x = f;
                                                    this.f22728y = zBooleanValue;
                                                    this.f22729z = (byte) 8;
                                                    if (ox3.m9322a(si1Var, this) != ap0Var) {
                                                        float f3 = f;
                                                        z = zBooleanValue;
                                                        i8 = i5;
                                                        displayMetrics5 = displayMetrics4;
                                                        i7 = i6;
                                                        f2 = f3;
                                                        this.f22723t = displayMetrics5;
                                                        this.f22724u = null;
                                                        this.f22725v = i7;
                                                        this.f22726w = i8;
                                                        this.f22727x = f2;
                                                        this.f22728y = z;
                                                        this.f22729z = (byte) 9;
                                                        objM7901I5 = lb5.m7901I(si1Var, this);
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        str2 = str4;
                                        if (xn2Var != 0) {
                                            strM12721a2 = xn2Var.m12721a();
                                            k44Var2 = k44.f22883b;
                                            if (xn2Var.f34459a.m8274a().compareTo(k44Var2) <= 0) {
                                                xn2Var.m12722b(k44Var2, strM12721a2, str2 + ol3Var.f26851a + ": visible area too small " + rect4, null);
                                            }
                                        }
                                    }
                                } else {
                                    j = ox3.f27190d;
                                    this.f22723t = displayMetrics2;
                                    this.f22725v = i;
                                    this.f22726w = i12;
                                    this.f22729z = (byte) 4;
                                    if (d24.m4318s(j, this) != ap0Var) {
                                        i3 = i;
                                        i2 = i12;
                                        this.f22723t = displayMetrics2;
                                        this.f22725v = i3;
                                        this.f22726w = i2;
                                        this.f22729z = (byte) 5;
                                        objM7901I3 = lb5.m7901I(si1Var, this);
                                    }
                                }
                            }
                        } else {
                            str4 = str4;
                            rect4 = new Rect();
                            accessibilityNodeInfo.getBoundsInScreen(rect4);
                            rect4.intersect(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
                            if (rect4.height() < 200) {
                            }
                            str2 = str4;
                            if (xn2Var != 0) {
                                strM12721a2 = xn2Var.m12721a();
                                k44Var2 = k44.f22883b;
                                if (xn2Var.f34459a.m8274a().compareTo(k44Var2) <= 0) {
                                    xn2Var.m12722b(k44Var2, strM12721a2, str2 + ol3Var.f26851a + ": visible area too small " + rect4, null);
                                }
                            }
                        }
                        break;
                    }
                    return ap0Var;
                }
                if (xn2Var != 0) {
                    strM12721a5 = xn2Var.m12721a();
                    k44Var5 = k44.f22883b;
                    if (xn2Var.f34459a.m8274a().compareTo(k44Var5) <= 0) {
                        xn2Var.m12722b(k44Var5, strM12721a5, c75.m3878j(str4, ol3Var.f26851a, ": refresh failed"), r1);
                    }
                }
                return ju4.f22634a;
            case 1:
                displayMetrics = this.f22723t;
                k43.m7376J(obj);
                objM7901I = obj;
                if (((ux3) objM7901I).f32235c == 0) {
                    i11 = b2;
                } else {
                    i11 = 0;
                }
                if (i11 == 0) {
                    AccessibilityNodeInfo accessibilityNodeInfo3 = accessibilityNodeInfo;
                    str3 = str4;
                    if (xn2Var != 0) {
                        strM12721a4 = xn2Var.m12721a();
                        k44Var4 = k44.f22883b;
                        if (xn2Var.f34459a.m8274a().compareTo(k44Var4) <= 0) {
                            displayMetrics6 = null;
                            xn2Var.m12722b(k44Var4, strM12721a4, c75.m3878j(str3, ol3Var.f26851a, ": near top, finishing with page actions"), null);
                        } else {
                            displayMetrics6 = null;
                        }
                    } else {
                        displayMetrics6 = null;
                    }
                    this.f22723t = displayMetrics6;
                    this.f22725v = i11;
                    this.f22729z = (byte) 2;
                    objM9325d = ox3.m9325d(accessibilityNodeInfo3, xn2Var, this);
                    break;
                } else {
                    AccessibilityNodeInfo accessibilityNodeInfo4 = accessibilityNodeInfo;
                    str3 = str4;
                    if (xn2Var != 0) {
                        strM12721a4 = xn2Var.m12721a();
                        k44Var4 = k44.f22883b;
                        if (xn2Var.f34459a.m8274a().compareTo(k44Var4) <= 0) {
                            displayMetrics6 = null;
                            xn2Var.m12722b(k44Var4, strM12721a4, c75.m3878j(str3, ol3Var.f26851a, ": near top, finishing with page actions"), null);
                        } else {
                            displayMetrics6 = null;
                        }
                    } else {
                        displayMetrics6 = null;
                    }
                    this.f22723t = displayMetrics6;
                    this.f22725v = i11;
                    this.f22729z = (byte) 2;
                    objM9325d = ox3.m9325d(accessibilityNodeInfo4, xn2Var, this);
                    break;
                }
                return ap0Var;
            case 2:
                k43.m7376J(obj);
                objM9325d = obj;
                if (((Boolean) objM9325d).booleanValue()) {
                    ml3Var3.f25002a = true;
                }
                return ju4.f22634a;
            case 3:
                i = this.f22725v;
                displayMetrics2 = this.f22723t;
                k43.m7376J(obj);
                objM7901I2 = obj;
                i12 = ((ux3) objM7901I2).f32233a;
                int i15 = ox3.f27193g;
                actionList = accessibilityNodeInfo.getActionList();
                accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION;
                if (actionList.contains(accessibilityAction)) {
                    zPerformAction = false;
                } else {
                    int id2 = accessibilityAction.getId();
                    Bundle bundle2 = new Bundle();
                    bundle2.putInt("android.view.accessibility.action.ARGUMENT_ROW_INT", 0);
                    bundle2.putInt("android.view.accessibility.action.ARGUMENT_COLUMN_INT", 0);
                    zPerformAction = accessibilityNodeInfo.performAction(id2, bundle2);
                    if (xn2Var != 0) {
                        strM12721a3 = xn2Var.m12721a();
                        k44Var3 = k44.f22883b;
                        if (xn2Var.f34459a.m8274a().compareTo(k44Var3) <= 0) {
                            xn2Var.m12722b(k44Var3, strM12721a3, "fast path: performAction = " + zPerformAction, null);
                        }
                    }
                }
                if (zPerformAction) {
                    DisplayMetrics displayMetrics8 = displayMetrics2;
                    i11 = i;
                    displayMetrics = displayMetrics8;
                    rect4 = new Rect();
                    accessibilityNodeInfo.getBoundsInScreen(rect4);
                    rect4.intersect(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
                    if (rect4.height() < 200) {
                        break;
                    }
                    str2 = str4;
                    if (xn2Var != 0) {
                        strM12721a2 = xn2Var.m12721a();
                        k44Var2 = k44.f22883b;
                        if (xn2Var.f34459a.m8274a().compareTo(k44Var2) <= 0) {
                            xn2Var.m12722b(k44Var2, strM12721a2, str2 + ol3Var.f26851a + ": visible area too small " + rect4, null);
                        }
                    }
                    return ju4.f22634a;
                }
                j = ox3.f27190d;
                this.f22723t = displayMetrics2;
                this.f22725v = i;
                this.f22726w = i12;
                this.f22729z = (byte) 4;
                if (d24.m4318s(j, this) != ap0Var) {
                    i3 = i;
                    i2 = i12;
                    this.f22723t = displayMetrics2;
                    this.f22725v = i3;
                    this.f22726w = i2;
                    this.f22729z = (byte) 5;
                    objM7901I3 = lb5.m7901I(si1Var, this);
                }
                break;
                return ap0Var;
            case 4:
                i2 = this.f22726w;
                int i16 = this.f22725v;
                DisplayMetrics displayMetrics9 = this.f22723t;
                k43.m7376J(obj);
                i3 = i16;
                displayMetrics2 = displayMetrics9;
                str4 = "fling ";
                this.f22723t = displayMetrics2;
                this.f22725v = i3;
                this.f22726w = i2;
                this.f22729z = (byte) 5;
                objM7901I3 = lb5.m7901I(si1Var, this);
                break;
            case 5:
                i2 = this.f22726w;
                displayMetrics2 = this.f22723t;
                k43.m7376J(obj);
                objM7901I3 = obj;
                str4 = "fling ";
                if (((ux3) objM7901I3).f32233a <= i2) {
                    if (xn2Var != 0) {
                        String strM12721a6 = xn2Var.m12721a();
                        k44 k44Var6 = k44.f22883b;
                        if (xn2Var.f34459a.m8274a().compareTo(k44Var6) <= 0) {
                            xn2Var.m12722b(k44Var6, strM12721a6, "fast path: no scroll event, disabling", null);
                        }
                    }
                    ml3Var2.f25002a = false;
                    displayMetrics = displayMetrics2;
                    str4 = str4;
                    r1 = 0;
                    b2 = 1;
                } else {
                    ml3Var3.f25002a = true;
                    displayMetrics = displayMetrics2;
                    str4 = str4;
                    r1 = 0;
                    b2 = 1;
                }
                if (accessibilityNodeInfo.refresh()) {
                    this.f22723t = displayMetrics;
                    this.f22724u = r1;
                    this.f22729z = b2;
                    objM7901I = lb5.m7901I(si1Var, this);
                    if (objM7901I != ap0Var) {
                        if (((ux3) objM7901I).f32235c == 0) {
                            i11 = b2;
                        } else {
                            i11 = 0;
                        }
                        if (i11 == 0) {
                            AccessibilityNodeInfo accessibilityNodeInfo5 = accessibilityNodeInfo;
                            str3 = str4;
                            if (xn2Var != 0) {
                                strM12721a4 = xn2Var.m12721a();
                                k44Var4 = k44.f22883b;
                                if (xn2Var.f34459a.m8274a().compareTo(k44Var4) <= 0) {
                                    displayMetrics6 = null;
                                    xn2Var.m12722b(k44Var4, strM12721a4, c75.m3878j(str3, ol3Var.f26851a, ": near top, finishing with page actions"), null);
                                } else {
                                    displayMetrics6 = null;
                                }
                            } else {
                                displayMetrics6 = null;
                            }
                            this.f22723t = displayMetrics6;
                            this.f22725v = i11;
                            this.f22729z = (byte) 2;
                            objM9325d = ox3.m9325d(accessibilityNodeInfo5, xn2Var, this);
                        } else {
                            AccessibilityNodeInfo accessibilityNodeInfo6 = accessibilityNodeInfo;
                            str3 = str4;
                            if (xn2Var != 0) {
                                strM12721a4 = xn2Var.m12721a();
                                k44Var4 = k44.f22883b;
                                if (xn2Var.f34459a.m8274a().compareTo(k44Var4) <= 0) {
                                    displayMetrics6 = null;
                                    xn2Var.m12722b(k44Var4, strM12721a4, c75.m3878j(str3, ol3Var.f26851a, ": near top, finishing with page actions"), null);
                                } else {
                                    displayMetrics6 = null;
                                }
                            } else {
                                displayMetrics6 = null;
                            }
                            this.f22723t = displayMetrics6;
                            this.f22725v = i11;
                            this.f22729z = (byte) 2;
                            objM9325d = ox3.m9325d(accessibilityNodeInfo6, xn2Var, this);
                        }
                        break;
                    }
                    return ap0Var;
                }
                if (xn2Var != 0) {
                    strM12721a5 = xn2Var.m12721a();
                    k44Var5 = k44.f22883b;
                    if (xn2Var.f34459a.m8274a().compareTo(k44Var5) <= 0) {
                        xn2Var.m12722b(k44Var5, strM12721a5, c75.m3878j(str4, ol3Var.f26851a, ": refresh failed"), r1);
                    }
                }
                return ju4.f22634a;
            case 6:
                int i17 = this.f22725v;
                rect = this.f22724u;
                DisplayMetrics displayMetrics10 = this.f22723t;
                k43.m7376J(obj);
                displayMetrics3 = displayMetrics10;
                str4 = "fling ";
                objM7901I4 = obj;
                i4 = i17;
                i9 = ((ux3) objM7901I4).f32233a;
                fExactCenterX = rect.exactCenterX();
                i10 = i4;
                long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits((rect.height() * 0.2f) + rect.top)) & 4294967295L) | (Float.floatToRawIntBits(fExactCenterX) << 32);
                long jFloatToRawIntBits4 = (((long) Float.floatToRawIntBits(fExactCenterX)) << 32) | (((long) Float.floatToRawIntBits((rect.height() * 0.85f) + rect.top)) & 4294967295L);
                this.f22723t = displayMetrics3;
                this.f22724u = null;
                this.f22725v = i10;
                this.f22726w = i9;
                this.f22727x = fExactCenterX;
                this.f22729z = (byte) 7;
                ml3Var = ml3Var2;
                rect2 = null;
                objM9327f = ox3.m9327f(this.f22716A, jFloatToRawIntBits3, jFloatToRawIntBits4, this);
                if (objM9327f != ap0Var) {
                    i6 = i10;
                    i5 = i9;
                    displayMetrics4 = displayMetrics3;
                    f = fExactCenterX;
                    zBooleanValue = ((Boolean) objM9327f).booleanValue();
                    if (xn2Var != 0) {
                        strM12721a = xn2Var.m12721a();
                        k44Var = k44.f22883b;
                        if (xn2Var.f34459a.m8274a().compareTo(k44Var) <= 0) {
                            str = str4;
                            rect3 = null;
                            xn2Var.m12722b(k44Var, strM12721a, str + ol3Var.f26851a + ": swipe completed=" + zBooleanValue, null);
                        } else {
                            rect3 = rect2;
                            str = str4;
                        }
                    } else {
                        rect3 = rect2;
                        str = str4;
                    }
                    if (zBooleanValue) {
                        ol3Var.f26851a++;
                        this.f22723t = displayMetrics4;
                        this.f22724u = rect3;
                        this.f22725v = i6;
                        this.f22726w = i5;
                        this.f22727x = f;
                        this.f22728y = zBooleanValue;
                        this.f22729z = (byte) 8;
                        if (ox3.m9322a(si1Var, this) != ap0Var) {
                            float f4 = f;
                            z = zBooleanValue;
                            i8 = i5;
                            displayMetrics5 = displayMetrics4;
                            i7 = i6;
                            f2 = f4;
                            this.f22723t = displayMetrics5;
                            this.f22724u = null;
                            this.f22725v = i7;
                            this.f22726w = i8;
                            this.f22727x = f2;
                            this.f22728y = z;
                            this.f22729z = (byte) 9;
                            objM7901I5 = lb5.m7901I(si1Var, this);
                        }
                        break;
                    }
                    return ju4.f22634a;
                }
                return ap0Var;
            case 7:
                float f5 = this.f22727x;
                i5 = this.f22726w;
                i6 = this.f22725v;
                displayMetrics4 = this.f22723t;
                k43.m7376J(obj);
                ml3Var = ml3Var2;
                str4 = "fling ";
                rect2 = null;
                f = f5;
                objM9327f = obj;
                zBooleanValue = ((Boolean) objM9327f).booleanValue();
                if (xn2Var != 0) {
                    strM12721a = xn2Var.m12721a();
                    k44Var = k44.f22883b;
                    if (xn2Var.f34459a.m8274a().compareTo(k44Var) <= 0) {
                        str = str4;
                        rect3 = null;
                        xn2Var.m12722b(k44Var, strM12721a, str + ol3Var.f26851a + ": swipe completed=" + zBooleanValue, null);
                    } else {
                        rect3 = rect2;
                        str = str4;
                    }
                } else {
                    rect3 = rect2;
                    str = str4;
                }
                if (zBooleanValue) {
                    ol3Var.f26851a++;
                    this.f22723t = displayMetrics4;
                    this.f22724u = rect3;
                    this.f22725v = i6;
                    this.f22726w = i5;
                    this.f22727x = f;
                    this.f22728y = zBooleanValue;
                    this.f22729z = (byte) 8;
                    if (ox3.m9322a(si1Var, this) != ap0Var) {
                        float f6 = f;
                        z = zBooleanValue;
                        i8 = i5;
                        displayMetrics5 = displayMetrics4;
                        i7 = i6;
                        f2 = f6;
                        this.f22723t = displayMetrics5;
                        this.f22724u = null;
                        this.f22725v = i7;
                        this.f22726w = i8;
                        this.f22727x = f2;
                        this.f22728y = z;
                        this.f22729z = (byte) 9;
                        objM7901I5 = lb5.m7901I(si1Var, this);
                        break;
                    }
                    return ap0Var;
                }
                return ju4.f22634a;
            case 8:
                boolean z2 = this.f22728y;
                float f7 = this.f22727x;
                int i18 = this.f22726w;
                i7 = this.f22725v;
                DisplayMetrics displayMetrics11 = this.f22723t;
                k43.m7376J(obj);
                z = z2;
                i8 = i18;
                ml3Var = ml3Var2;
                accessibilityNodeInfo = accessibilityNodeInfo;
                f2 = f7;
                displayMetrics5 = displayMetrics11;
                str = "fling ";
                this.f22723t = displayMetrics5;
                this.f22724u = null;
                this.f22725v = i7;
                this.f22726w = i8;
                this.f22727x = f2;
                this.f22728y = z;
                this.f22729z = (byte) 9;
                objM7901I5 = lb5.m7901I(si1Var, this);
                break;
            case 9:
                i8 = this.f22726w;
                displayMetrics5 = this.f22723t;
                k43.m7376J(obj);
                objM7901I5 = obj;
                ml3Var = ml3Var2;
                accessibilityNodeInfo = accessibilityNodeInfo;
                str = "fling ";
                if (((ux3) objM7901I5).f32233a > i8) {
                    ml3Var3.f25002a = true;
                    b2 = 1;
                    displayMetrics = displayMetrics5;
                    str4 = str;
                    ml3Var2 = ml3Var;
                    accessibilityNodeInfo = accessibilityNodeInfo;
                    r1 = 0;
                    if (accessibilityNodeInfo.refresh()) {
                        this.f22723t = displayMetrics;
                        this.f22724u = r1;
                        this.f22729z = b2;
                        objM7901I = lb5.m7901I(si1Var, this);
                        if (objM7901I != ap0Var) {
                            if (((ux3) objM7901I).f32235c == 0) {
                                i11 = b2;
                            } else {
                                i11 = 0;
                            }
                            if (i11 == 0) {
                                AccessibilityNodeInfo accessibilityNodeInfo7 = accessibilityNodeInfo;
                                str3 = str4;
                                if (xn2Var != 0) {
                                    strM12721a4 = xn2Var.m12721a();
                                    k44Var4 = k44.f22883b;
                                    if (xn2Var.f34459a.m8274a().compareTo(k44Var4) <= 0) {
                                        displayMetrics6 = null;
                                        xn2Var.m12722b(k44Var4, strM12721a4, c75.m3878j(str3, ol3Var.f26851a, ": near top, finishing with page actions"), null);
                                    } else {
                                        displayMetrics6 = null;
                                    }
                                } else {
                                    displayMetrics6 = null;
                                }
                                this.f22723t = displayMetrics6;
                                this.f22725v = i11;
                                this.f22729z = (byte) 2;
                                objM9325d = ox3.m9325d(accessibilityNodeInfo7, xn2Var, this);
                            } else {
                                AccessibilityNodeInfo accessibilityNodeInfo8 = accessibilityNodeInfo;
                                str3 = str4;
                                if (xn2Var != 0) {
                                    strM12721a4 = xn2Var.m12721a();
                                    k44Var4 = k44.f22883b;
                                    if (xn2Var.f34459a.m8274a().compareTo(k44Var4) <= 0) {
                                        displayMetrics6 = null;
                                        xn2Var.m12722b(k44Var4, strM12721a4, c75.m3878j(str3, ol3Var.f26851a, ": near top, finishing with page actions"), null);
                                    } else {
                                        displayMetrics6 = null;
                                    }
                                } else {
                                    displayMetrics6 = null;
                                }
                                this.f22723t = displayMetrics6;
                                this.f22725v = i11;
                                this.f22729z = (byte) 2;
                                objM9325d = ox3.m9325d(accessibilityNodeInfo8, xn2Var, this);
                            }
                            break;
                        }
                        return ap0Var;
                    }
                    if (xn2Var != 0) {
                        strM12721a5 = xn2Var.m12721a();
                        k44Var5 = k44.f22883b;
                        if (xn2Var.f34459a.m8274a().compareTo(k44Var5) <= 0) {
                            xn2Var.m12722b(k44Var5, strM12721a5, c75.m3878j(str4, ol3Var.f26851a, ": refresh failed"), r1);
                        }
                    }
                } else if (xn2Var != 0) {
                    String strM12721a7 = xn2Var.m12721a();
                    k44 k44Var7 = k44.f22883b;
                    if (xn2Var.f34459a.m8274a().compareTo(k44Var7) <= 0) {
                        xn2Var.m12722b(k44Var7, strM12721a7, c75.m3878j(str, ol3Var.f26851a, ": no scroll event, stopping"), null);
                    }
                }
                return ju4.f22634a;
            default:
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
