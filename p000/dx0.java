package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.BlendModeColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import androidx.compose.p001ui.platform.AndroidCompositionLocals_androidKt;
import java.lang.invoke.VarHandle;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class dx0 {

    /* JADX INFO: renamed from: a */
    public static final ed3 f17476a = new ed3(30, true);

    /* JADX INFO: renamed from: a */
    public static final void m4785a(pj4 pj4Var, dj4 dj4Var, mi0 mi0Var, int i) {
        Object obj;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(1904307118);
        int i2 = (ir1Var.m6890g(pj4Var) ? 4 : 2) | i | (ir1Var.m6894i(dj4Var) ? 32 : 16);
        if (ir1Var.m6871T(i2 & 1, (i2 & 19) != 18)) {
            ir1Var.m6885d0(-1009482584);
            Context context = (Context) ir1Var.m6898k(AndroidCompositionLocals_androidKt.f14651b);
            ir1Var.m6912r(false);
            boolean zM6894i = ir1Var.m6894i(dj4Var) | ((i2 & 14) == 4) | ir1Var.m6894i(context);
            Object objM6869O = ir1Var.m6869O();
            if (zM6894i || objM6869O == ki0.f23136a) {
                obj = objM6869O;
                C1164t c1164t = new C1164t((byte) 10);
                c1164t.f30700c = dj4Var;
                c1164t.f30699b = context;
                c1164t.f30701d = pj4Var;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(c1164t);
                obj = c1164t;
            }
            obj = objM6869O;
            tm0.m11062b(null, null, (yp1) obj, ir1Var, 0, 3);
        } else {
            ir1Var.m6874W();
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            ne0 ne0Var = new ne0((byte) 23);
            ne0Var.f25728b = pj4Var;
            ne0Var.f25729c = dj4Var;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = ne0Var;
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0245  */
    /* JADX WARN: Code duplicated, block: B:104:0x0250  */
    /* JADX WARN: Code duplicated, block: B:108:0x0269  */
    /* JADX WARN: Code duplicated, block: B:110:0x026c  */
    /* JADX WARN: Code duplicated, block: B:112:0x026f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:113:0x0271  */
    /* JADX WARN: Code duplicated, block: B:114:0x0274  */
    /* JADX WARN: Code duplicated, block: B:115:0x0277  */
    /* JADX WARN: Code duplicated, block: B:116:0x027a  */
    /* JADX WARN: Code duplicated, block: B:117:0x027f  */
    /* JADX WARN: Code duplicated, block: B:118:0x0282  */
    /* JADX WARN: Code duplicated, block: B:119:0x0285  */
    /* JADX WARN: Code duplicated, block: B:123:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:130:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:132:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:137:0x02ef A[LOOP:2: B:136:0x02ed->B:137:0x02ef, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:146:0x030e  */
    /* JADX WARN: Code duplicated, block: B:147:0x0311  */
    /* JADX WARN: Code duplicated, block: B:149:0x0317  */
    /* JADX WARN: Code duplicated, block: B:151:0x0320  */
    /* JADX WARN: Code duplicated, block: B:153:0x0327  */
    /* JADX WARN: Code duplicated, block: B:161:0x0338  */
    /* JADX WARN: Code duplicated, block: B:162:0x033d  */
    /* JADX WARN: Code duplicated, block: B:165:0x0393  */
    /* JADX WARN: Code duplicated, block: B:166:0x0396  */
    /* JADX WARN: Code duplicated, block: B:169:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:170:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:172:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:174:0x03c6  */
    /* JADX WARN: Code duplicated, block: B:177:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:179:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:180:0x03da  */
    /* JADX WARN: Code duplicated, block: B:183:0x03f0  */
    /* JADX WARN: Code duplicated, block: B:185:0x03fd  */
    /* JADX WARN: Code duplicated, block: B:187:0x0401  */
    /* JADX WARN: Code duplicated, block: B:190:0x0411  */
    /* JADX WARN: Code duplicated, block: B:191:0x0416  */
    /* JADX WARN: Code duplicated, block: B:194:0x043b  */
    /* JADX WARN: Code duplicated, block: B:195:0x043f  */
    /* JADX WARN: Code duplicated, block: B:198:0x0450  */
    /* JADX WARN: Code duplicated, block: B:200:0x0453  */
    /* JADX WARN: Code duplicated, block: B:202:0x0456  */
    /* JADX WARN: Code duplicated, block: B:203:0x0459  */
    /* JADX WARN: Code duplicated, block: B:204:0x045c  */
    /* JADX WARN: Code duplicated, block: B:207:0x046a  */
    /* JADX WARN: Code duplicated, block: B:208:0x046d  */
    /* JADX WARN: Code duplicated, block: B:211:0x047f  */
    /* JADX WARN: Code duplicated, block: B:213:0x0482  */
    /* JADX WARN: Code duplicated, block: B:216:0x0488  */
    /* JADX WARN: Code duplicated, block: B:217:0x048b  */
    /* JADX WARN: Code duplicated, block: B:218:0x048f  */
    /* JADX WARN: Code duplicated, block: B:221:0x04d3  */
    /* JADX WARN: Code duplicated, block: B:222:0x04d8  */
    /* JADX WARN: Code duplicated, block: B:226:0x04f7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:227:0x04f9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:228:0x04fb  */
    /* JADX WARN: Code duplicated, block: B:229:0x050b  */
    /* JADX WARN: Code duplicated, block: B:234:0x0524 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:235:0x0526 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:236:0x0528  */
    /* JADX WARN: Code duplicated, block: B:237:0x0537  */
    /* JADX WARN: Code duplicated, block: B:240:0x0547  */
    /* JADX WARN: Code duplicated, block: B:241:0x054a  */
    /* JADX WARN: Code duplicated, block: B:245:0x055a  */
    /* JADX WARN: Code duplicated, block: B:247:0x0566  */
    /* JADX WARN: Code duplicated, block: B:248:0x0568  */
    /* JADX WARN: Code duplicated, block: B:250:0x056c  */
    /* JADX WARN: Code duplicated, block: B:251:0x0572  */
    /* JADX WARN: Code duplicated, block: B:254:0x058b  */
    /* JADX WARN: Code duplicated, block: B:256:0x058f  */
    /* JADX WARN: Code duplicated, block: B:259:0x059f  */
    /* JADX WARN: Code duplicated, block: B:260:0x05a2  */
    /* JADX WARN: Code duplicated, block: B:319:0x05d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:321:0x0554 A[SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public static final void m4786b(int i, long j, mi0 mi0Var, int i2) {
        TypedValue typedValue;
        boolean z;
        Object obj;
        Object c0759ie;
        i73 l00Var;
        Object obj2;
        Object obj3;
        TypedArray typedArray;
        boolean z2;
        XmlResourceParser xmlResourceParser;
        long jM13869d;
        long j2;
        int i3;
        int i4;
        f12 f12Var;
        int i5;
        List list;
        XmlResourceParser xmlResourceParser2;
        nh3 nh3Var;
        int i6;
        int eventType;
        String name;
        int iHashCode;
        char c;
        int[] iArr;
        int i7;
        TypedArray typedArrayObtainStyledAttributes;
        String string;
        String str;
        String string2;
        int[] iArr2;
        int i8;
        TypedArray typedArrayObtainStyledAttributes2;
        String string3;
        String str2;
        String string4;
        List list2;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        Shader shader;
        int i14;
        t30 ga4Var;
        Shader shader2;
        int i15;
        t30 ga4Var2;
        int i16;
        int[] iArr3;
        TypedArray typedArrayObtainStyledAttributes3;
        String string5;
        String str3;
        int[] iArrCopyOf;
        int i17;
        int i18;
        int[] iArr4;
        int i19;
        ColorStateList colorStateListM5089a;
        long j3 = j;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(-1240244237);
        int i20 = (i2 & 6) == 0 ? (ir1Var.m6886e(i) ? 4 : 2) | i2 : i2;
        if ((i2 & 48) == 0) {
            i20 |= ir1Var.m6888f(j3) ? 32 : 16;
        }
        int i21 = i20;
        if (ir1Var.m6871T(i21 & 1, (i21 & 19) != 18)) {
            nc4 nc4Var = AndroidCompositionLocals_androidKt.f14651b;
            Context context = (Context) ir1Var.m6898k(nc4Var);
            boolean zM6890g = ir1Var.m6890g(context) | ((i21 & 14) == 4);
            Object objM6869O = ir1Var.m6869O();
            if (zM6890g || objM6869O == ki0.f23136a) {
                objM6869O = Integer.valueOf(context.obtainStyledAttributes(new int[]{i}).getResourceId(0, -1));
                ir1Var.m6905n0(objM6869O);
            }
            int iIntValue = ((Number) objM6869O).intValue();
            if (iIntValue == -1) {
                yk3 yk3VarM6916v = ir1Var.m6916v();
                if (yk3VarM6916v != null) {
                    bx0 bx0Var = new bx0((byte) 1);
                    bx0Var.f15667b = i;
                    bx0Var.f15668c = j3;
                    bx0Var.f15669d = i2;
                    VarHandle.storeStoreFence();
                    yk3VarM6916v.f35300d = bx0Var;
                    return;
                }
                return;
            }
            Context context2 = (Context) ir1Var.m6898k(nc4Var);
            Resources resources = (Resources) ir1Var.m6898k(AndroidCompositionLocals_androidKt.f14652c);
            ro3 ro3Var = (ro3) ir1Var.m6898k(AndroidCompositionLocals_androidKt.f14654e);
            synchronized (ro3Var) {
                typedValue = (TypedValue) ro3Var.f29477a.m8197b(iIntValue);
                if (typedValue == null) {
                    typedValue = new TypedValue();
                    resources.getValue(iIntValue, typedValue, true);
                    lv2 lv2Var = ro3Var.f29477a;
                    int iM8117d = lv2Var.m8117d(iIntValue);
                    Object[] objArr = lv2Var.f24667c;
                    Object obj4 = objArr[iM8117d];
                    lv2Var.f24666b[iM8117d] = iIntValue;
                    objArr[iM8117d] = typedValue;
                }
            }
            CharSequence charSequence = typedValue.string;
            if (charSequence == null || !hd4.m6338d0(charSequence, ".xml")) {
                i21 = i21;
                z = true;
                ir1Var.m6885d0(-1771643000);
                boolean zM6890g2 = ir1Var.m6890g(context2.getTheme()) | ir1Var.m6890g(charSequence) | ir1Var.m6886e(iIntValue);
                Object objM6869O2 = ir1Var.m6869O();
                if (zM6890g2 || objM6869O2 == ki0.f23136a) {
                    obj = null;
                    try {
                        c0759ie = new C0759ie(((BitmapDrawable) resources.getDrawable(iIntValue, null)).getBitmap());
                        ir1Var.m6905n0(c0759ie);
                    } catch (Exception e) {
                        throw new gf0("Error attempting to load resource: " + ((Object) charSequence), e);
                    }
                } else {
                    c0759ie = objM6869O2;
                    obj = null;
                }
                t02 t02Var = (t02) c0759ie;
                l00Var = new l00(t02Var, (((long) ((C0759ie) t02Var).f21276a.getHeight()) & 4294967295L) | (((long) ((C0759ie) t02Var).f21276a.getWidth()) << 32));
                ir1Var.m6912r(false);
            } else {
                ir1Var.m6885d0(-1771798434);
                Resources.Theme theme = context2.getTheme();
                int i22 = typedValue.changingConfigurations;
                j12 j12Var = (j12) ir1Var.m6898k(AndroidCompositionLocals_androidKt.f14653d);
                i12 i12Var = new i12();
                i12Var.f21004a = theme;
                i12Var.f21005b = iIntValue;
                VarHandle.storeStoreFence();
                WeakReference weakReference = (WeakReference) j12Var.f21952a.get(i12Var);
                h12 h12Var = weakReference != null ? (h12) weakReference.get() : null;
                if (h12Var == null) {
                    XmlResourceParser xml = resources.getXml(iIntValue);
                    int next = xml.next();
                    while (next != 2 && next != 1) {
                        next = xml.next();
                    }
                    if (next != 2) {
                        throw new XmlPullParserException("No start tag found");
                    }
                    if (!z62.m13387o(xml.getName(), "vector")) {
                        C1077qn.m9987m("Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG, WEBP");
                        return;
                    }
                    AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                    C1145sh c1145sh = new C1145sh();
                    c1145sh.f30264c = xml;
                    c1145sh.f30262a = 0;
                    c1145sh.f30266e = new nh3((byte) 27);
                    VarHandle.storeStoreFence();
                    int[] iArr5 = i20.f21047a;
                    TypedArray typedArrayObtainAttributes = theme == null ? resources.obtainAttributes(attributeSetAsAttributeSet, iArr5) : theme.obtainStyledAttributes(attributeSetAsAttributeSet, iArr5, 0, 0);
                    c1145sh.m10775p(typedArrayObtainAttributes.getChangingConfigurations());
                    if (xml.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null) {
                        typedArray = typedArrayObtainAttributes;
                        z2 = typedArray.getBoolean(5, false);
                    } else {
                        typedArray = typedArrayObtainAttributes;
                        z2 = false;
                    }
                    c1145sh.m10775p(typedArray.getChangingConfigurations());
                    float fM10773n = c1145sh.m10773n(typedArray, "viewportWidth", 7, 0.0f);
                    float fM10773n2 = c1145sh.m10773n(typedArray, "viewportHeight", 8, 0.0f);
                    if (fM10773n <= 0.0f) {
                        throw new XmlPullParserException(typedArray.getPositionDescription() + "<VectorGraphic> tag requires viewportWidth > 0");
                    }
                    if (fM10773n2 <= 0.0f) {
                        throw new XmlPullParserException(typedArray.getPositionDescription() + "<VectorGraphic> tag requires viewportHeight > 0");
                    }
                    float dimension = typedArray.getDimension(3, 0.0f);
                    c1145sh.m10775p(typedArray.getChangingConfigurations());
                    float dimension2 = typedArray.getDimension(2, 0.0f);
                    c1145sh.m10775p(typedArray.getChangingConfigurations());
                    if (typedArray.hasValue(1)) {
                        TypedValue typedValue2 = new TypedValue();
                        typedArray.getValue(1, typedValue2);
                        if (typedValue2.type == 2) {
                            xmlResourceParser = xml;
                            j2 = pb0.f27501h;
                        } else {
                            if (xml.getAttributeValue("http://schemas.android.com/apk/res/android", "tint") != null) {
                                TypedValue typedValue3 = new TypedValue();
                                typedArray.getValue(1, typedValue3);
                                int i23 = typedValue3.type;
                                if (i23 == 2) {
                                    throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue3);
                                }
                                if (i23 < 28 || i23 > 31) {
                                    Resources resources2 = typedArray.getResources();
                                    xmlResourceParser = xml;
                                    int resourceId = typedArray.getResourceId(1, 0);
                                    ThreadLocal threadLocal = ed0.f18012a;
                                    try {
                                        colorStateListM5089a = ed0.m5089a(resources2, resources2.getXml(resourceId), theme);
                                    } catch (Exception e2) {
                                        Log.e("CSLCompat", "Failed to inflate ColorStateList.", e2);
                                        colorStateListM5089a = null;
                                    }
                                } else {
                                    colorStateListM5089a = ColorStateList.valueOf(typedValue3.data);
                                    xmlResourceParser = xml;
                                }
                                c1145sh.m10775p(typedArray.getChangingConfigurations());
                                if (colorStateListM5089a != null) {
                                    jM13869d = zy5.m13869d(colorStateListM5089a.getDefaultColor());
                                } else {
                                    jM13869d = pb0.f27501h;
                                }
                            } else {
                                xmlResourceParser = xml;
                            }
                            colorStateListM5089a = null;
                            c1145sh.m10775p(typedArray.getChangingConfigurations());
                            if (colorStateListM5089a != null) {
                                jM13869d = zy5.m13869d(colorStateListM5089a.getDefaultColor());
                            } else {
                                jM13869d = pb0.f27501h;
                            }
                        }
                        i3 = typedArray.getInt(6, -1);
                        c1145sh.m10775p(typedArray.getChangingConfigurations());
                        if (i3 == -1) {
                            i4 = 5;
                        } else if (i3 != 3) {
                            i4 = 3;
                        } else if (i3 == 5) {
                            i4 = 5;
                        } else if (i3 != 9) {
                            switch (i3) {
                                case 14:
                                    i4 = 13;
                                    break;
                                case 15:
                                    i4 = 14;
                                    break;
                                case 16:
                                    i4 = 12;
                                    break;
                                default:
                                    i4 = 5;
                                    break;
                            }
                        } else {
                            i4 = 9;
                        }
                        float f = dimension / resources.getDisplayMetrics().density;
                        float f2 = dimension2 / resources.getDisplayMetrics().density;
                        typedArray.recycle();
                        f12Var = new f12(null, f, f2, fM10773n, fM10773n2, j2, i4, z2, 1);
                        i5 = 0;
                        while (true) {
                            if (xmlResourceParser.getEventType() == 1) {
                                z = true;
                            } else if (xmlResourceParser.getDepth() < 1 || xmlResourceParser.getEventType() != 3) {
                                list = v71.f32439a;
                                xmlResourceParser2 = (XmlResourceParser) c1145sh.f30264c;
                                nh3Var = (nh3) c1145sh.f30266e;
                                i6 = i5;
                                eventType = xmlResourceParser2.getEventType();
                                if (eventType != 2) {
                                    if (eventType == 3 && "group".equals(xmlResourceParser2.getName())) {
                                        i17 = i6 + 1;
                                        for (i18 = 0; i18 < i17; i18++) {
                                            f12Var.m5450f();
                                        }
                                        iArr4 = (int[]) c1145sh.f30265d;
                                        if (iArr4 != null || (i19 = c1145sh.f30263b) == 0) {
                                            i5 = 0;
                                        } else {
                                            int i24 = i19 - 1;
                                            c1145sh.f30263b = i24;
                                            i5 = iArr4[i24];
                                        }
                                        c = '\t';
                                    }
                                    attributeSetAsAttributeSet = attributeSetAsAttributeSet;
                                    c = '\t';
                                    i5 = i6;
                                } else {
                                    name = xmlResourceParser2.getName();
                                    if (name == null) {
                                        attributeSetAsAttributeSet = attributeSetAsAttributeSet;
                                        c = '\t';
                                        i5 = i6;
                                    } else {
                                        iHashCode = name.hashCode();
                                        if (iHashCode != -1649314686) {
                                            if (iHashCode != 3433509) {
                                                if (iHashCode == 98629247 && name.equals("group")) {
                                                    iArr3 = i20.f21048b;
                                                    if (theme == null) {
                                                        typedArrayObtainStyledAttributes3 = resources.obtainAttributes(attributeSetAsAttributeSet, iArr3);
                                                    } else {
                                                        typedArrayObtainStyledAttributes3 = theme.obtainStyledAttributes(attributeSetAsAttributeSet, iArr3, 0, 0);
                                                    }
                                                    c1145sh.m10775p(typedArrayObtainStyledAttributes3.getChangingConfigurations());
                                                    float fM10773n3 = c1145sh.m10773n(typedArrayObtainStyledAttributes3, "rotation", 5, 0.0f);
                                                    float f3 = typedArrayObtainStyledAttributes3.getFloat(1, 0.0f);
                                                    c1145sh.m10775p(typedArrayObtainStyledAttributes3.getChangingConfigurations());
                                                    float f4 = typedArrayObtainStyledAttributes3.getFloat(2, 0.0f);
                                                    c1145sh.m10775p(typedArrayObtainStyledAttributes3.getChangingConfigurations());
                                                    float fM10773n4 = c1145sh.m10773n(typedArrayObtainStyledAttributes3, "scaleX", 3, 1.0f);
                                                    float fM10773n5 = c1145sh.m10773n(typedArrayObtainStyledAttributes3, "scaleY", 4, 1.0f);
                                                    float fM10773n6 = c1145sh.m10773n(typedArrayObtainStyledAttributes3, "translateX", 6, 0.0f);
                                                    float fM10773n7 = c1145sh.m10773n(typedArrayObtainStyledAttributes3, "translateY", 7, 0.0f);
                                                    string5 = typedArrayObtainStyledAttributes3.getString(0);
                                                    c1145sh.m10775p(typedArrayObtainStyledAttributes3.getChangingConfigurations());
                                                    if (string5 == null) {
                                                        str3 = "";
                                                    } else {
                                                        str3 = string5;
                                                    }
                                                    typedArrayObtainStyledAttributes3.recycle();
                                                    int i25 = uw4.f32218a;
                                                    f12Var.m5447a(str3, fM10773n3, f3, f4, fM10773n4, fM10773n5, fM10773n6, fM10773n7, list);
                                                    iArrCopyOf = (int[]) c1145sh.f30265d;
                                                    if (iArrCopyOf == null) {
                                                        iArrCopyOf = new int[4];
                                                        c1145sh.f30265d = iArrCopyOf;
                                                    } else if (c1145sh.f30263b >= iArrCopyOf.length) {
                                                        iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length * 2);
                                                        c1145sh.f30265d = iArrCopyOf;
                                                    }
                                                    int i26 = c1145sh.f30263b;
                                                    c1145sh.f30263b = i26 + 1;
                                                    iArrCopyOf[i26] = i6;
                                                    i5 = 0;
                                                    c = '\t';
                                                }
                                            } else if (name.equals("path")) {
                                                iArr2 = i20.f21049c;
                                                if (theme == null) {
                                                    typedArrayObtainStyledAttributes2 = resources.obtainAttributes(attributeSetAsAttributeSet, iArr2);
                                                    i8 = 0;
                                                } else {
                                                    i8 = 0;
                                                    typedArrayObtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSetAsAttributeSet, iArr2, 0, 0);
                                                }
                                                c1145sh.m10775p(typedArrayObtainStyledAttributes2.getChangingConfigurations());
                                                if (xmlResourceParser2.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                                    C1077qn.m9987m("No path data available");
                                                    return;
                                                }
                                                string3 = typedArrayObtainStyledAttributes2.getString(i8);
                                                c1145sh.m10775p(typedArrayObtainStyledAttributes2.getChangingConfigurations());
                                                if (string3 == null) {
                                                    str2 = "";
                                                } else {
                                                    str2 = string3;
                                                }
                                                string4 = typedArrayObtainStyledAttributes2.getString(2);
                                                c1145sh.m10775p(typedArrayObtainStyledAttributes2.getChangingConfigurations());
                                                if (string4 == null) {
                                                    int i27 = uw4.f32218a;
                                                    list2 = list;
                                                } else {
                                                    ArrayList arrayList = new ArrayList();
                                                    nh3Var.m8742I(string4, arrayList);
                                                    list2 = arrayList;
                                                }
                                                hf0 hf0VarM10772m = c1145sh.m10772m(typedArrayObtainStyledAttributes2, theme, "fillColor", 1);
                                                float fM10773n8 = c1145sh.m10773n(typedArrayObtainStyledAttributes2, "fillAlpha", 12, 1.0f);
                                                if (y62.m12942J((XmlResourceParser) c1145sh.f30264c, "strokeLineCap")) {
                                                    i9 = typedArrayObtainStyledAttributes2.getInt(8, -1);
                                                } else {
                                                    i9 = -1;
                                                }
                                                c1145sh.m10775p(typedArrayObtainStyledAttributes2.getChangingConfigurations());
                                                if (i9 == 0) {
                                                    i10 = 0;
                                                } else if (i9 != 1) {
                                                    i10 = 1;
                                                } else if (i9 != 2) {
                                                    i10 = 0;
                                                } else {
                                                    i10 = 2;
                                                }
                                                if (y62.m12942J((XmlResourceParser) c1145sh.f30264c, "strokeLineJoin")) {
                                                    i11 = typedArrayObtainStyledAttributes2.getInt(9, -1);
                                                } else {
                                                    i11 = -1;
                                                }
                                                c1145sh.m10775p(typedArrayObtainStyledAttributes2.getChangingConfigurations());
                                                if (i11 == 0) {
                                                    if (i11 != 1) {
                                                        i12 = 1;
                                                    } else if (i11 != 2) {
                                                        i12 = 2;
                                                    }
                                                    float fM10773n9 = c1145sh.m10773n(typedArrayObtainStyledAttributes2, "strokeMiterLimit", 10, 4.0f);
                                                    hf0 hf0VarM10772m2 = c1145sh.m10772m(typedArrayObtainStyledAttributes2, theme, "strokeColor", 3);
                                                    float fM10773n10 = c1145sh.m10773n(typedArrayObtainStyledAttributes2, "strokeAlpha", 11, 1.0f);
                                                    float fM10773n11 = c1145sh.m10773n(typedArrayObtainStyledAttributes2, "strokeWidth", 4, 1.0f);
                                                    float fM10773n12 = c1145sh.m10773n(typedArrayObtainStyledAttributes2, "trimPathEnd", 6, 1.0f);
                                                    float fM10773n13 = c1145sh.m10773n(typedArrayObtainStyledAttributes2, "trimPathOffset", 7, 0.0f);
                                                    float fM10773n14 = c1145sh.m10773n(typedArrayObtainStyledAttributes2, "trimPathStart", 5, 0.0f);
                                                    if (y62.m12942J((XmlResourceParser) c1145sh.f30264c, "fillType")) {
                                                        i13 = typedArrayObtainStyledAttributes2.getInt(13, 0);
                                                    } else {
                                                        i13 = 0;
                                                    }
                                                    c1145sh.m10775p(typedArrayObtainStyledAttributes2.getChangingConfigurations());
                                                    typedArrayObtainStyledAttributes2.recycle();
                                                    shader = (Shader) hf0VarM10772m.f20529c;
                                                    i14 = hf0VarM10772m.f20528b;
                                                    if (shader == null && i14 == 0) {
                                                        ga4Var = null;
                                                    } else if (shader != null) {
                                                        u30 u30Var = new u30();
                                                        u30Var.f31634c = shader;
                                                        u30Var.f31633b = 9205357640488583168L;
                                                        VarHandle.storeStoreFence();
                                                        ga4Var = u30Var;
                                                    } else {
                                                        ga4Var = new ga4(zy5.m13869d(i14));
                                                    }
                                                    shader2 = (Shader) hf0VarM10772m2.f20529c;
                                                    i15 = hf0VarM10772m2.f20528b;
                                                    if (shader2 == null && i15 == 0) {
                                                        ga4Var2 = null;
                                                    } else if (shader2 != null) {
                                                        u30 u30Var2 = new u30();
                                                        u30Var2.f31634c = shader2;
                                                        u30Var2.f31633b = 9205357640488583168L;
                                                        VarHandle.storeStoreFence();
                                                        ga4Var2 = u30Var2;
                                                    } else {
                                                        ga4Var2 = new ga4(zy5.m13869d(i15));
                                                    }
                                                    if (i13 == 0) {
                                                        i16 = 0;
                                                    } else {
                                                        i16 = 1;
                                                    }
                                                    f12Var.m5448b(list2, i16, str2, ga4Var, fM10773n8, ga4Var2, fM10773n10, fM10773n11, i10, i12, fM10773n9, fM10773n14, fM10773n12, fM10773n13);
                                                    i5 = i6;
                                                    c = '\t';
                                                }
                                                i12 = 0;
                                                float fM10773n15 = c1145sh.m10773n(typedArrayObtainStyledAttributes2, "strokeMiterLimit", 10, 4.0f);
                                                hf0 hf0VarM10772m3 = c1145sh.m10772m(typedArrayObtainStyledAttributes2, theme, "strokeColor", 3);
                                                float fM10773n16 = c1145sh.m10773n(typedArrayObtainStyledAttributes2, "strokeAlpha", 11, 1.0f);
                                                float fM10773n17 = c1145sh.m10773n(typedArrayObtainStyledAttributes2, "strokeWidth", 4, 1.0f);
                                                float fM10773n18 = c1145sh.m10773n(typedArrayObtainStyledAttributes2, "trimPathEnd", 6, 1.0f);
                                                float fM10773n19 = c1145sh.m10773n(typedArrayObtainStyledAttributes2, "trimPathOffset", 7, 0.0f);
                                                float fM10773n110 = c1145sh.m10773n(typedArrayObtainStyledAttributes2, "trimPathStart", 5, 0.0f);
                                                if (y62.m12942J((XmlResourceParser) c1145sh.f30264c, "fillType")) {
                                                    i13 = 0;
                                                } else {
                                                    i13 = typedArrayObtainStyledAttributes2.getInt(13, 0);
                                                }
                                                c1145sh.m10775p(typedArrayObtainStyledAttributes2.getChangingConfigurations());
                                                typedArrayObtainStyledAttributes2.recycle();
                                                shader = (Shader) hf0VarM10772m.f20529c;
                                                i14 = hf0VarM10772m.f20528b;
                                                if (shader == null) {
                                                    ga4Var = null;
                                                } else if (shader != null) {
                                                    u30 u30Var3 = new u30();
                                                    u30Var3.f31634c = shader;
                                                    u30Var3.f31633b = 9205357640488583168L;
                                                    VarHandle.storeStoreFence();
                                                    ga4Var = u30Var3;
                                                } else {
                                                    ga4Var = new ga4(zy5.m13869d(i14));
                                                }
                                                shader2 = (Shader) hf0VarM10772m3.f20529c;
                                                i15 = hf0VarM10772m3.f20528b;
                                                if (shader2 == null) {
                                                    ga4Var2 = null;
                                                } else if (shader2 != null) {
                                                    u30 u30Var4 = new u30();
                                                    u30Var4.f31634c = shader2;
                                                    u30Var4.f31633b = 9205357640488583168L;
                                                    VarHandle.storeStoreFence();
                                                    ga4Var2 = u30Var4;
                                                } else {
                                                    ga4Var2 = new ga4(zy5.m13869d(i15));
                                                }
                                                if (i13 == 0) {
                                                    i16 = 0;
                                                } else {
                                                    i16 = 1;
                                                }
                                                f12Var.m5448b(list2, i16, str2, ga4Var, fM10773n8, ga4Var2, fM10773n16, fM10773n17, i10, i12, fM10773n15, fM10773n110, fM10773n18, fM10773n19);
                                                i5 = i6;
                                                c = '\t';
                                            }
                                            attributeSetAsAttributeSet = attributeSetAsAttributeSet;
                                            c = '\t';
                                            i5 = i6;
                                        } else {
                                            attributeSetAsAttributeSet = attributeSetAsAttributeSet;
                                            c = '\t';
                                            if (name.equals("clip-path")) {
                                                iArr = i20.f21050d;
                                                if (theme == null) {
                                                    typedArrayObtainStyledAttributes = resources.obtainAttributes(attributeSetAsAttributeSet, iArr);
                                                    i7 = 0;
                                                } else {
                                                    i7 = 0;
                                                    typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSetAsAttributeSet, iArr, 0, 0);
                                                }
                                                c1145sh.m10775p(typedArrayObtainStyledAttributes.getChangingConfigurations());
                                                string = typedArrayObtainStyledAttributes.getString(i7);
                                                c1145sh.m10775p(typedArrayObtainStyledAttributes.getChangingConfigurations());
                                                if (string == null) {
                                                    str = "";
                                                } else {
                                                    str = string;
                                                }
                                                string2 = typedArrayObtainStyledAttributes.getString(1);
                                                c1145sh.m10775p(typedArrayObtainStyledAttributes.getChangingConfigurations());
                                                if (string2 == null) {
                                                    int i28 = uw4.f32218a;
                                                } else {
                                                    ArrayList arrayList2 = new ArrayList();
                                                    nh3Var.m8742I(string2, arrayList2);
                                                    list = arrayList2;
                                                }
                                                typedArrayObtainStyledAttributes.recycle();
                                                f12Var.m5447a(str, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, list);
                                                i5 = i6 + 1;
                                            } else {
                                                i5 = i6;
                                            }
                                        }
                                    }
                                }
                                xmlResourceParser.next();
                                attributeSetAsAttributeSet = attributeSetAsAttributeSet;
                            } else {
                                z = true;
                            }
                        }
                        int i29 = i22 | c1145sh.f30262a;
                        g12 g12VarM5449e = f12Var.m5449e();
                        h12 h12Var2 = new h12();
                        h12Var2.f20262a = g12VarM5449e;
                        h12Var2.f20263b = i29;
                        VarHandle.storeStoreFence();
                        j12Var.f21952a.put(i12Var, new WeakReference(h12Var2));
                        h12Var = h12Var2;
                    } else {
                        xmlResourceParser = xml;
                        jM13869d = pb0.f27501h;
                    }
                    j2 = jM13869d;
                    i3 = typedArray.getInt(6, -1);
                    c1145sh.m10775p(typedArray.getChangingConfigurations());
                    if (i3 == -1) {
                        i4 = 5;
                    } else if (i3 != 3) {
                        i4 = 3;
                    } else if (i3 == 5) {
                        i4 = 5;
                    } else if (i3 != 9) {
                        switch (i3) {
                            case 14:
                                i4 = 13;
                                break;
                            case 15:
                                i4 = 14;
                                break;
                            case 16:
                                i4 = 12;
                                break;
                            default:
                                i4 = 5;
                                break;
                        }
                    } else {
                        i4 = 9;
                    }
                    float f5 = dimension / resources.getDisplayMetrics().density;
                    float f6 = dimension2 / resources.getDisplayMetrics().density;
                    typedArray.recycle();
                    f12Var = new f12(null, f5, f6, fM10773n, fM10773n2, j2, i4, z2, 1);
                    i5 = 0;
                    while (true) {
                        if (xmlResourceParser.getEventType() == 1) {
                            if (xmlResourceParser.getDepth() < 1) {
                            }
                            list = v71.f32439a;
                            xmlResourceParser2 = (XmlResourceParser) c1145sh.f30264c;
                            nh3Var = (nh3) c1145sh.f30266e;
                            i6 = i5;
                            eventType = xmlResourceParser2.getEventType();
                            if (eventType != 2) {
                                if (eventType == 3) {
                                    i17 = i6 + 1;
                                    while (i18 < i17) {
                                        f12Var.m5450f();
                                    }
                                    iArr4 = (int[]) c1145sh.f30265d;
                                    if (iArr4 != null) {
                                        i5 = 0;
                                    } else {
                                        i5 = 0;
                                    }
                                    c = '\t';
                                }
                                attributeSetAsAttributeSet = attributeSetAsAttributeSet;
                                c = '\t';
                                i5 = i6;
                            } else {
                                name = xmlResourceParser2.getName();
                                if (name == null) {
                                    attributeSetAsAttributeSet = attributeSetAsAttributeSet;
                                    c = '\t';
                                    i5 = i6;
                                } else {
                                    iHashCode = name.hashCode();
                                    if (iHashCode != -1649314686) {
                                        if (iHashCode != 3433509) {
                                            if (iHashCode == 98629247) {
                                                iArr3 = i20.f21048b;
                                                if (theme == null) {
                                                    typedArrayObtainStyledAttributes3 = resources.obtainAttributes(attributeSetAsAttributeSet, iArr3);
                                                } else {
                                                    typedArrayObtainStyledAttributes3 = theme.obtainStyledAttributes(attributeSetAsAttributeSet, iArr3, 0, 0);
                                                }
                                                c1145sh.m10775p(typedArrayObtainStyledAttributes3.getChangingConfigurations());
                                                float fM10773n20 = c1145sh.m10773n(typedArrayObtainStyledAttributes3, "rotation", 5, 0.0f);
                                                float f7 = typedArrayObtainStyledAttributes3.getFloat(1, 0.0f);
                                                c1145sh.m10775p(typedArrayObtainStyledAttributes3.getChangingConfigurations());
                                                float f8 = typedArrayObtainStyledAttributes3.getFloat(2, 0.0f);
                                                c1145sh.m10775p(typedArrayObtainStyledAttributes3.getChangingConfigurations());
                                                float fM10773n21 = c1145sh.m10773n(typedArrayObtainStyledAttributes3, "scaleX", 3, 1.0f);
                                                float fM10773n22 = c1145sh.m10773n(typedArrayObtainStyledAttributes3, "scaleY", 4, 1.0f);
                                                float fM10773n23 = c1145sh.m10773n(typedArrayObtainStyledAttributes3, "translateX", 6, 0.0f);
                                                float fM10773n24 = c1145sh.m10773n(typedArrayObtainStyledAttributes3, "translateY", 7, 0.0f);
                                                string5 = typedArrayObtainStyledAttributes3.getString(0);
                                                c1145sh.m10775p(typedArrayObtainStyledAttributes3.getChangingConfigurations());
                                                if (string5 == null) {
                                                    str3 = "";
                                                } else {
                                                    str3 = string5;
                                                }
                                                typedArrayObtainStyledAttributes3.recycle();
                                                int i210 = uw4.f32218a;
                                                f12Var.m5447a(str3, fM10773n20, f7, f8, fM10773n21, fM10773n22, fM10773n23, fM10773n24, list);
                                                iArrCopyOf = (int[]) c1145sh.f30265d;
                                                if (iArrCopyOf == null) {
                                                    iArrCopyOf = new int[4];
                                                    c1145sh.f30265d = iArrCopyOf;
                                                } else if (c1145sh.f30263b >= iArrCopyOf.length) {
                                                    iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length * 2);
                                                    c1145sh.f30265d = iArrCopyOf;
                                                }
                                                int i211 = c1145sh.f30263b;
                                                c1145sh.f30263b = i211 + 1;
                                                iArrCopyOf[i211] = i6;
                                                i5 = 0;
                                                c = '\t';
                                            }
                                        } else if (name.equals("path")) {
                                            iArr2 = i20.f21049c;
                                            if (theme == null) {
                                                typedArrayObtainStyledAttributes2 = resources.obtainAttributes(attributeSetAsAttributeSet, iArr2);
                                                i8 = 0;
                                            } else {
                                                i8 = 0;
                                                typedArrayObtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSetAsAttributeSet, iArr2, 0, 0);
                                            }
                                            c1145sh.m10775p(typedArrayObtainStyledAttributes2.getChangingConfigurations());
                                            if (xmlResourceParser2.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                                C1077qn.m9987m("No path data available");
                                                return;
                                            }
                                            string3 = typedArrayObtainStyledAttributes2.getString(i8);
                                            c1145sh.m10775p(typedArrayObtainStyledAttributes2.getChangingConfigurations());
                                            if (string3 == null) {
                                                str2 = "";
                                            } else {
                                                str2 = string3;
                                            }
                                            string4 = typedArrayObtainStyledAttributes2.getString(2);
                                            c1145sh.m10775p(typedArrayObtainStyledAttributes2.getChangingConfigurations());
                                            if (string4 == null) {
                                                int i212 = uw4.f32218a;
                                                list2 = list;
                                            } else {
                                                ArrayList arrayList3 = new ArrayList();
                                                nh3Var.m8742I(string4, arrayList3);
                                                list2 = arrayList3;
                                            }
                                            hf0 hf0VarM10772m4 = c1145sh.m10772m(typedArrayObtainStyledAttributes2, theme, "fillColor", 1);
                                            float fM10773n25 = c1145sh.m10773n(typedArrayObtainStyledAttributes2, "fillAlpha", 12, 1.0f);
                                            if (y62.m12942J((XmlResourceParser) c1145sh.f30264c, "strokeLineCap")) {
                                                i9 = -1;
                                            } else {
                                                i9 = typedArrayObtainStyledAttributes2.getInt(8, -1);
                                            }
                                            c1145sh.m10775p(typedArrayObtainStyledAttributes2.getChangingConfigurations());
                                            if (i9 == 0) {
                                                i10 = 0;
                                            } else if (i9 != 1) {
                                                i10 = 1;
                                            } else if (i9 != 2) {
                                                i10 = 0;
                                            } else {
                                                i10 = 2;
                                            }
                                            if (y62.m12942J((XmlResourceParser) c1145sh.f30264c, "strokeLineJoin")) {
                                                i11 = -1;
                                            } else {
                                                i11 = typedArrayObtainStyledAttributes2.getInt(9, -1);
                                            }
                                            c1145sh.m10775p(typedArrayObtainStyledAttributes2.getChangingConfigurations());
                                            if (i11 == 0) {
                                                if (i11 != 1) {
                                                    i12 = 1;
                                                } else if (i11 != 2) {
                                                    i12 = 2;
                                                }
                                                float fM10773n111 = c1145sh.m10773n(typedArrayObtainStyledAttributes2, "strokeMiterLimit", 10, 4.0f);
                                                hf0 hf0VarM10772m5 = c1145sh.m10772m(typedArrayObtainStyledAttributes2, theme, "strokeColor", 3);
                                                float fM10773n112 = c1145sh.m10773n(typedArrayObtainStyledAttributes2, "strokeAlpha", 11, 1.0f);
                                                float fM10773n113 = c1145sh.m10773n(typedArrayObtainStyledAttributes2, "strokeWidth", 4, 1.0f);
                                                float fM10773n114 = c1145sh.m10773n(typedArrayObtainStyledAttributes2, "trimPathEnd", 6, 1.0f);
                                                float fM10773n115 = c1145sh.m10773n(typedArrayObtainStyledAttributes2, "trimPathOffset", 7, 0.0f);
                                                float fM10773n116 = c1145sh.m10773n(typedArrayObtainStyledAttributes2, "trimPathStart", 5, 0.0f);
                                                if (y62.m12942J((XmlResourceParser) c1145sh.f30264c, "fillType")) {
                                                    i13 = 0;
                                                } else {
                                                    i13 = typedArrayObtainStyledAttributes2.getInt(13, 0);
                                                }
                                                c1145sh.m10775p(typedArrayObtainStyledAttributes2.getChangingConfigurations());
                                                typedArrayObtainStyledAttributes2.recycle();
                                                shader = (Shader) hf0VarM10772m4.f20529c;
                                                i14 = hf0VarM10772m4.f20528b;
                                                if (shader == null) {
                                                    ga4Var = null;
                                                } else if (shader != null) {
                                                    u30 u30Var5 = new u30();
                                                    u30Var5.f31634c = shader;
                                                    u30Var5.f31633b = 9205357640488583168L;
                                                    VarHandle.storeStoreFence();
                                                    ga4Var = u30Var5;
                                                } else {
                                                    ga4Var = new ga4(zy5.m13869d(i14));
                                                }
                                                shader2 = (Shader) hf0VarM10772m5.f20529c;
                                                i15 = hf0VarM10772m5.f20528b;
                                                if (shader2 == null) {
                                                    ga4Var2 = null;
                                                } else if (shader2 != null) {
                                                    u30 u30Var6 = new u30();
                                                    u30Var6.f31634c = shader2;
                                                    u30Var6.f31633b = 9205357640488583168L;
                                                    VarHandle.storeStoreFence();
                                                    ga4Var2 = u30Var6;
                                                } else {
                                                    ga4Var2 = new ga4(zy5.m13869d(i15));
                                                }
                                                if (i13 == 0) {
                                                    i16 = 0;
                                                } else {
                                                    i16 = 1;
                                                }
                                                f12Var.m5448b(list2, i16, str2, ga4Var, fM10773n25, ga4Var2, fM10773n112, fM10773n113, i10, i12, fM10773n111, fM10773n116, fM10773n114, fM10773n115);
                                                i5 = i6;
                                                c = '\t';
                                            }
                                            i12 = 0;
                                            float fM10773n117 = c1145sh.m10773n(typedArrayObtainStyledAttributes2, "strokeMiterLimit", 10, 4.0f);
                                            hf0 hf0VarM10772m6 = c1145sh.m10772m(typedArrayObtainStyledAttributes2, theme, "strokeColor", 3);
                                            float fM10773n118 = c1145sh.m10773n(typedArrayObtainStyledAttributes2, "strokeAlpha", 11, 1.0f);
                                            float fM10773n119 = c1145sh.m10773n(typedArrayObtainStyledAttributes2, "strokeWidth", 4, 1.0f);
                                            float fM10773n1110 = c1145sh.m10773n(typedArrayObtainStyledAttributes2, "trimPathEnd", 6, 1.0f);
                                            float fM10773n1111 = c1145sh.m10773n(typedArrayObtainStyledAttributes2, "trimPathOffset", 7, 0.0f);
                                            float fM10773n1112 = c1145sh.m10773n(typedArrayObtainStyledAttributes2, "trimPathStart", 5, 0.0f);
                                            if (y62.m12942J((XmlResourceParser) c1145sh.f30264c, "fillType")) {
                                                i13 = 0;
                                            } else {
                                                i13 = typedArrayObtainStyledAttributes2.getInt(13, 0);
                                            }
                                            c1145sh.m10775p(typedArrayObtainStyledAttributes2.getChangingConfigurations());
                                            typedArrayObtainStyledAttributes2.recycle();
                                            shader = (Shader) hf0VarM10772m4.f20529c;
                                            i14 = hf0VarM10772m4.f20528b;
                                            if (shader == null) {
                                                ga4Var = null;
                                            } else if (shader != null) {
                                                u30 u30Var7 = new u30();
                                                u30Var7.f31634c = shader;
                                                u30Var7.f31633b = 9205357640488583168L;
                                                VarHandle.storeStoreFence();
                                                ga4Var = u30Var7;
                                            } else {
                                                ga4Var = new ga4(zy5.m13869d(i14));
                                            }
                                            shader2 = (Shader) hf0VarM10772m6.f20529c;
                                            i15 = hf0VarM10772m6.f20528b;
                                            if (shader2 == null) {
                                                ga4Var2 = null;
                                            } else if (shader2 != null) {
                                                u30 u30Var8 = new u30();
                                                u30Var8.f31634c = shader2;
                                                u30Var8.f31633b = 9205357640488583168L;
                                                VarHandle.storeStoreFence();
                                                ga4Var2 = u30Var8;
                                            } else {
                                                ga4Var2 = new ga4(zy5.m13869d(i15));
                                            }
                                            if (i13 == 0) {
                                                i16 = 0;
                                            } else {
                                                i16 = 1;
                                            }
                                            f12Var.m5448b(list2, i16, str2, ga4Var, fM10773n25, ga4Var2, fM10773n118, fM10773n119, i10, i12, fM10773n117, fM10773n1112, fM10773n1110, fM10773n1111);
                                            i5 = i6;
                                            c = '\t';
                                        }
                                        attributeSetAsAttributeSet = attributeSetAsAttributeSet;
                                        c = '\t';
                                        i5 = i6;
                                    } else {
                                        attributeSetAsAttributeSet = attributeSetAsAttributeSet;
                                        c = '\t';
                                        if (name.equals("clip-path")) {
                                            i5 = i6;
                                        } else {
                                            iArr = i20.f21050d;
                                            if (theme == null) {
                                                typedArrayObtainStyledAttributes = resources.obtainAttributes(attributeSetAsAttributeSet, iArr);
                                                i7 = 0;
                                            } else {
                                                i7 = 0;
                                                typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSetAsAttributeSet, iArr, 0, 0);
                                            }
                                            c1145sh.m10775p(typedArrayObtainStyledAttributes.getChangingConfigurations());
                                            string = typedArrayObtainStyledAttributes.getString(i7);
                                            c1145sh.m10775p(typedArrayObtainStyledAttributes.getChangingConfigurations());
                                            if (string == null) {
                                                str = "";
                                            } else {
                                                str = string;
                                            }
                                            string2 = typedArrayObtainStyledAttributes.getString(1);
                                            c1145sh.m10775p(typedArrayObtainStyledAttributes.getChangingConfigurations());
                                            if (string2 == null) {
                                                int i213 = uw4.f32218a;
                                            } else {
                                                ArrayList arrayList4 = new ArrayList();
                                                nh3Var.m8742I(string2, arrayList4);
                                                list = arrayList4;
                                            }
                                            typedArrayObtainStyledAttributes.recycle();
                                            f12Var.m5447a(str, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, list);
                                            i5 = i6 + 1;
                                        }
                                    }
                                }
                            }
                            xmlResourceParser.next();
                            attributeSetAsAttributeSet = attributeSetAsAttributeSet;
                        } else {
                            z = true;
                        }
                    }
                    int i214 = i22 | c1145sh.f30262a;
                    g12 g12VarM5449e2 = f12Var.m5449e();
                    h12 h12Var3 = new h12();
                    h12Var3.f20262a = g12VarM5449e2;
                    h12Var3.f20263b = i214;
                    VarHandle.storeStoreFence();
                    j12Var.f21952a.put(i12Var, new WeakReference(h12Var3));
                    h12Var = h12Var3;
                } else {
                    i21 = i21;
                    z = true;
                }
                l00Var = se0.m10706U(h12Var.f20262a, ir1Var);
                ir1Var.m6912r(false);
                obj = null;
            }
            boolean z3 = (i21 & 112) == 32 ? z : false;
            Object objM6869O3 = ir1Var.m6869O();
            if (z3 || objM6869O3 == ki0.f23136a) {
                if (j == 16) {
                    j3 = j;
                    obj2 = obj;
                } else {
                    BlendModeColorFilter blendModeColorFilter = new BlendModeColorFilter(zy5.m13858V(j), d24.m4295J(5));
                    o00 o00Var = new o00();
                    o00Var.f26229a = blendModeColorFilter;
                    j3 = j;
                    o00Var.f26230b = j3;
                    o00Var.f26231c = 5;
                    VarHandle.storeStoreFence();
                    obj2 = o00Var;
                }
                ir1Var.m6905n0(obj2);
                obj3 = obj2;
            } else {
                obj3 = objM6869O3;
                j3 = j;
            }
            nt2 nt2VarM8579g = n74.m8579g(kt2.f23428a, qm0.f28566e);
            jm0.f22418cp.getClass();
            q20.m9702a(se0.m10703R(nt2VarM8579g, l00Var, (o00) obj3, 22), ir1Var, 0);
        } else {
            ir1Var.m6874W();
        }
        yk3 yk3VarM6916v2 = ir1Var.m6916v();
        if (yk3VarM6916v2 != null) {
            bx0 bx0Var2 = new bx0((byte) 0);
            bx0Var2.f15667b = i;
            bx0Var2.f15668c = j3;
            bx0Var2.f15669d = i2;
            VarHandle.storeStoreFence();
            yk3VarM6916v2.f35300d = bx0Var2;
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m4787c(pj4 pj4Var, ej4 ej4Var, wp1 wp1Var, mi0 mi0Var, int i) {
        int i2;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(-2040393164);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? ir1Var.m6890g(pj4Var) : ir1Var.m6894i(pj4Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? ir1Var.m6890g(ej4Var) : ir1Var.m6894i(ej4Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ir1Var.m6894i(wp1Var) ? 256 : 128;
        }
        boolean z = false;
        if (ir1Var.m6871T(i2 & 1, (i2 & 147) != 146)) {
            boolean z2 = (i2 & 112) == 32 || ((i2 & 64) != 0 && ir1Var.m6890g(ej4Var));
            Object objM6869O = ir1Var.m6869O();
            byte b = 22;
            i50 i50Var = ki0.f23136a;
            Object obj = objM6869O;
            if (z2 || objM6869O == i50Var) {
                C0675g4 c0675g4 = new C0675g4(b);
                c0675g4.f19600b = ej4Var;
                c0675g4.f19601c = wp1Var;
                VarHandle.storeStoreFence();
                ar3 ar3Var = new ar3((byte) 17);
                ar3Var.f14813b = c0675g4;
                VarHandle.storeStoreFence();
                np2 np2Var = new np2();
                np2Var.f26014a = ar3Var;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(np2Var);
                obj = np2Var;
            }
            np2 np2Var2 = (np2) obj;
            if ((i2 & 14) == 4 || ((i2 & 8) != 0 && ir1Var.m6894i(pj4Var))) {
                z = true;
            }
            Object objM6869O2 = ir1Var.m6869O();
            Object obj2 = objM6869O2;
            if (z || objM6869O2 == i50Var) {
                C1053q c1053q = new C1053q((byte) 21);
                c1053q.f28113b = pj4Var;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(c1053q);
                obj2 = c1053q;
            }
            wp1 wp1Var2 = (wp1) obj2;
            ne0 ne0Var = new ne0(b);
            ne0Var.f25728b = ej4Var;
            ne0Var.f25729c = pj4Var;
            VarHandle.storeStoreFence();
            AbstractC1217uf.m11536a(np2Var2, wp1Var2, f17476a, vd6.m11834R(1315155414, ne0Var, ir1Var), ir1Var, 3456, 0);
        } else {
            ir1Var.m6874W();
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            C1403zf c1403zf = new C1403zf((byte) 5);
            c1403zf.f36036c = pj4Var;
            c1403zf.f36037d = ej4Var;
            c1403zf.f36038e = wp1Var;
            c1403zf.f36035b = i;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = c1403zf;
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m4788d(nt2 nt2Var, pg0 pg0Var, mi0 mi0Var, int i) {
        int i2;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(1392105195);
        if ((i & 6) == 0) {
            i2 = (ir1Var.m6890g(nt2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ir1Var.m6894i(pg0Var) ? 32 : 16;
        }
        if (ir1Var.m6871T(i2 & 1, (i2 & 19) != 18)) {
            AbstractC1356y5.m12909c(nt2Var, nj4.f25890a, pg0Var, ir1Var, ((i2 << 6) & 7168) | (i2 & 14) | 432);
        } else {
            ir1Var.m6874W();
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            C0688gh c0688gh = new C0688gh((byte) 2);
            c0688gh.f19788b = nt2Var;
            c0688gh.f19789c = pg0Var;
            c0688gh.f19790d = i;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = c0688gh;
        }
    }
}
