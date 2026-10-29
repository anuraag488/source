package p000;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import java.lang.invoke.VarHandle;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class vj2 {

    /* JADX INFO: renamed from: a */
    public View f32668a;

    /* JADX INFO: renamed from: b */
    public z32 f32669b;

    /* JADX INFO: renamed from: c */
    public yp1 f32670c;

    /* JADX INFO: renamed from: d */
    public yp1 f32671d;

    /* JADX INFO: renamed from: e */
    public uj2 f32672e;

    /* JADX INFO: renamed from: f */
    public pk4 f32673f;

    /* JADX INFO: renamed from: g */
    public fy4 f32674g;

    /* JADX INFO: renamed from: h */
    public xk4 f32675h;

    /* JADX INFO: renamed from: i */
    public l12 f32676i;

    /* JADX INFO: renamed from: j */
    public ArrayList f32677j;

    /* JADX INFO: renamed from: k */
    public pg2 f32678k;

    /* JADX INFO: renamed from: l */
    public Rect f32679l;

    /* JADX INFO: renamed from: m */
    public fj2 f32680m;

    /* JADX INFO: renamed from: a */
    public final gl3 m11902a(EditorInfo editorInfo) {
        int i;
        int i2;
        boolean z;
        xk4 xk4Var = this.f32675h;
        String str = xk4Var.f34341a.f24092b;
        long j = xk4Var.f34342b;
        l12 l12Var = this.f32676i;
        int i3 = l12Var.f23700d;
        int i4 = l12Var.f23699c;
        if (i3 == 1) {
            i = 0;
        } else if (i3 == 0) {
            i = 1;
        } else if (i3 == 2) {
            i = 2;
        } else if (i3 == 6) {
            i = 5;
        } else if (i3 == 5) {
            i = 7;
        } else if (i3 == 3) {
            i = 3;
        } else if (i3 == 4) {
            i = 4;
        } else {
            if (i3 != 7) {
                C1077qn.m9989o("invalid ImeAction");
                return null;
            }
            i = 6;
        }
        editorInfo.imeOptions = i;
        zm2 zm2Var = l12Var.f23701e;
        if (z62.m13387o(zm2Var, zm2.f36182c)) {
            editorInfo.hintLocales = null;
        } else {
            ArrayList arrayList = new ArrayList(ib0.m6717y0(zm2Var, 10));
            Iterator it = zm2Var.f36183a.iterator();
            while (it.hasNext()) {
                arrayList.add(((ym2) it.next()).f35328a);
            }
            Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
            editorInfo.hintLocales = new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
        }
        if (i4 == 1) {
            i2 = 1;
        } else if (i4 == 2) {
            editorInfo.imeOptions |= Integer.MIN_VALUE;
            i2 = 1;
        } else if (i4 == 3) {
            i2 = 2;
        } else if (i4 == 4) {
            i2 = 3;
        } else {
            i2 = 17;
            if (i4 != 5) {
                if (i4 == 6) {
                    i2 = 33;
                } else if (i4 == 7) {
                    i2 = 129;
                } else if (i4 == 8) {
                    i2 = 18;
                } else if (i4 == 9) {
                    i2 = 8194;
                } else if (i4 == 10) {
                    i2 = 145;
                } else if (i4 == 11) {
                    i2 = 113;
                } else if (i4 == 12) {
                    i2 = 97;
                } else if (i4 == 13) {
                    i2 = 49;
                } else if (i4 == 14) {
                    i2 = 65;
                } else if (i4 == 15) {
                    i2 = 81;
                } else if (i4 == 16) {
                    i2 = 177;
                } else if (i4 == 17) {
                    i2 = 193;
                } else if (i4 == 18) {
                    i2 = 4;
                } else {
                    i2 = 20;
                    if (i4 != 19) {
                        if (i4 == 20) {
                            i2 = 36;
                        } else if (i4 == 21) {
                            i2 = 4098;
                        } else if (i4 == 22) {
                            i2 = 12290;
                        } else if (i4 == 23) {
                            i2 = 8210;
                        } else if (i4 == 24) {
                            i2 = 4114;
                        } else {
                            if (i4 != 25) {
                                C1077qn.m9989o("Invalid Keyboard Type");
                                return 0;
                            }
                            i2 = 12306;
                        }
                    }
                }
            }
        }
        editorInfo.inputType = i2;
        if ((i2 & 15) == 1) {
            i2 |= 131072;
            editorInfo.inputType = i2;
            if (l12Var.f23700d == 1) {
                editorInfo.imeOptions |= 1073741824;
            }
        }
        if ((i2 & 15) == 1) {
            int i5 = l12Var.f23697a;
            if (i5 == 1) {
                i2 |= 4096;
                editorInfo.inputType = i2;
            } else if (i5 == 2) {
                i2 |= 8192;
                editorInfo.inputType = i2;
            } else if (i5 == 3) {
                i2 |= 16384;
                editorInfo.inputType = i2;
            }
            if (l12Var.f23698b) {
                i2 |= 32768;
                editorInfo.inputType = i2;
            }
            if (Build.VERSION.SDK_INT >= 37) {
                editorInfo.inputType = 2097152 | i2;
            }
        }
        int i6 = ql4.f28557c;
        editorInfo.initialSelStart = (int) (j >> 32);
        editorInfo.initialSelEnd = (int) (j & 4294967295L);
        editorInfo.setInitialSurroundingSubText(str, 0);
        editorInfo.imeOptions |= 33554432;
        if (!ud4.f31794a || i4 == 7 || i4 == 10 || i4 == 8 || i4 == 23 || i4 == 24 || i4 == 25) {
            if (Build.VERSION.SDK_INT >= 35) {
                z = false;
                d71.m4393a(editorInfo, false);
            } else {
                z = false;
            }
            Bundle bundle = editorInfo.extras;
            if (bundle == null) {
                bundle = new Bundle();
                editorInfo.extras = bundle;
            }
            bundle.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", z);
        } else {
            if (Build.VERSION.SDK_INT >= 35) {
                d71.m4393a(editorInfo, true);
            }
            Bundle bundle2 = editorInfo.extras;
            if (bundle2 == null) {
                bundle2 = new Bundle();
                editorInfo.extras = bundle2;
            }
            bundle2.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", true);
            editorInfo.setSupportedHandwritingGestures(kx5.m7694Y(AbstractC1243v4.m11731l(), AbstractC1243v4.m11744y(), AbstractC1243v4.m11741v(), AbstractC1243v4.m11743x(), AbstractC1243v4.m11745z(), AbstractC1243v4.m11718A(), AbstractC1243v4.m11719B()));
            editorInfo.setSupportedHandwritingGesturePreviews(AbstractC0990oo.m9216k0(new Class[]{AbstractC1243v4.m11731l(), AbstractC1243v4.m11744y(), AbstractC1243v4.m11741v(), AbstractC1243v4.m11743x()}));
        }
        oj2 oj2Var = pj2.f27654a;
        xk4 xk4Var2 = this.f32675h;
        boolean z2 = this.f32676i.f23698b;
        js1 js1Var = new js1();
        js1Var.f22555a = this;
        VarHandle.storeStoreFence();
        uj2 uj2Var = this.f32672e;
        pk4 pk4Var = this.f32673f;
        fy4 fy4Var = this.f32674g;
        gl3 gl3Var = new gl3();
        gl3Var.f19858a = js1Var;
        gl3Var.f19859b = z2;
        gl3Var.f19860c = uj2Var;
        gl3Var.f19861d = pk4Var;
        gl3Var.f19862e = fy4Var;
        gl3Var.f19864g = xk4Var2;
        gl3Var.f19867j = new ArrayList();
        gl3Var.f19868k = true;
        VarHandle.storeStoreFence();
        this.f32677j.add(new WeakReference(gl3Var));
        return gl3Var;
    }
}
