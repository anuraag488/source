package p000;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.inputmethodservice.InputMethodService;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import essentials.app.EsApp;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.zip.ZipInputStream;

/* JADX INFO: renamed from: q */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1053q implements wp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f28112a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f28113b;

    public /* synthetic */ C1053q(byte b) {
        this.f28112a = b;
    }

    /* JADX WARN: Code duplicated, block: B:173:0x046f  */
    /* JADX WARN: Code duplicated, block: B:181:0x047d  */
    /* JADX WARN: Code duplicated, block: B:187:0x048c  */
    /* JADX WARN: Code duplicated, block: B:189:0x0490  */
    /* JADX WARN: Code duplicated, block: B:190:0x0492  */
    /* JADX WARN: Code duplicated, block: B:191:0x0495  */
    /* JADX WARN: Code duplicated, block: B:192:0x0498  */
    /* JADX WARN: Code duplicated, block: B:194:0x049e  */
    /* JADX WARN: Code duplicated, block: B:204:0x04c1  */
    /* JADX WARN: Code duplicated, block: B:207:0x04c7  */
    /* JADX WARN: Code duplicated, block: B:285:0x05ef A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:286:0x05f1  */
    /* JADX WARN: Code duplicated, block: B:288:0x0602  */
    /* JADX WARN: Code duplicated, block: B:290:0x0606  */
    /* JADX WARN: Code duplicated, block: B:292:0x061b  */
    /* JADX WARN: Code duplicated, block: B:295:0x0626  */
    /* JADX WARN: Code duplicated, block: B:298:0x0643  */
    /* JADX WARN: Code duplicated, block: B:301:0x064c  */
    /* JADX WARN: Code duplicated, block: B:303:0x0656  */
    /* JADX WARN: Code duplicated, block: B:310:0x0670  */
    /* JADX WARN: Code duplicated, block: B:312:0x067e  */
    /* JADX WARN: Code duplicated, block: B:321:0x06a9  */
    /* JADX WARN: Code duplicated, block: B:323:0x06b6  */
    /* JADX WARN: Code duplicated, block: B:325:0x06be  */
    /* JADX WARN: Code duplicated, block: B:400:0x0879  */
    /* JADX WARN: Code duplicated, block: B:412:0x0880 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:423:0x0467 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:427:0x0485 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x0270  */
    /* JADX WARN: Code duplicated, block: B:90:0x027f  */
    /* JADX WARN: Code duplicated, block: B:91:0x0282  */
    /* JADX WARN: Code duplicated, block: B:93:0x02b1  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v114, types: [h15] */
    /* JADX WARN: Type inference failed for: r0v174 */
    /* JADX WARN: Type inference failed for: r0v175 */
    /* JADX WARN: Type inference failed for: r13v0, types: [wm0] */
    /* JADX WARN: Type inference failed for: r13v12, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v18 */
    @Override // p000.wp1
    public final Object invoke() {
        int i;
        boolean z;
        xb1 xb1Var;
        Context context;
        boolean z2;
        int i2;
        int i3;
        int iMin;
        double dMax;
        Bitmap bitmapDecodeStream;
        Exception exc;
        Matrix matrix;
        float width;
        float height;
        RectF rectF;
        float f;
        Bitmap.Config config;
        Bitmap bitmapCreateBitmap;
        boolean z3;
        ac1 ac1VarM5059c;
        int iM188e;
        boolean z4;
        ac1 ac1VarM5059c2;
        int iM188e2;
        int i4;
        ty0 ty0Var;
        ?? r0;
        byte b = 4;
        byte b2 = 6;
        byte b3 = 7;
        byte b4 = 9;
        boolean z5 = false;
        byte b5 = 1;
        ?? r13 = 0;
        r13 = 0;
        switch (this.f28112a) {
            case 0:
                ag0 ag0VarM12798a = ((xz4) ((C0861l6) this.f28113b).f23812a.f24677b).m12798a();
                C0677g6 c0677g6 = new C0677g6();
                gu5 gu5Var = (gu5) ((cr6) wo5.m12345f(ag0VarM12798a).f33570e).mo4146j();
                gu5Var.getClass();
                ky5.m7752a();
                dc6 dc6Var = (dc6) ((cr6) wo5.m12345f(ag0VarM12798a).f33573h).mo4146j();
                if (dc6Var == null) {
                    Handler handler = ky5.f23626a;
                    p62 p62Var = new p62((byte) 5);
                    VarHandle.storeStoreFence();
                    handler.post(p62Var);
                } else {
                    if (dc6Var.f16986c.f20143c.get() != null) {
                        i = 2;
                    } else {
                        i = 2;
                        if (dc6Var.m4442b() != 2) {
                            Handler handler2 = ky5.f23626a;
                            p62 p62Var2 = new p62(b2);
                            VarHandle.storeStoreFence();
                            handler2.post(p62Var2);
                            if (dc6Var.m4443c()) {
                                synchronized (dc6Var.f16988e) {
                                    z = dc6Var.f16991h;
                                    break;
                                }
                                if (z) {
                                    boolean zM4443c = dc6Var.m4443c();
                                    synchronized (dc6Var.f16988e) {
                                        boolean z6 = dc6Var.f16991h;
                                        break;
                                    }
                                    Log.w("UserMessagingPlatform", "Retry request is not executed. consentInfoUpdateHasBeenCalled=" + zM4443c + ", retryRequestIsInProgress=" + z6);
                                } else {
                                    synchronized (dc6Var.f16988e) {
                                        dc6Var.f16991h = true;
                                        break;
                                    }
                                    wo5 wo5Var = dc6Var.f16985b;
                                    f70 f70Var = dc6Var.f16992i;
                                    bt5 bt5Var = new bt5(b4);
                                    bt5Var.f15596b = dc6Var;
                                    VarHandle.storeStoreFence();
                                    rr5 rr5Var = new rr5((byte) 11);
                                    rr5Var.f29555b = dc6Var;
                                    VarHandle.storeStoreFence();
                                    wo5Var.getClass();
                                    wb6 wb6Var = new wb6((byte) 3);
                                    wb6Var.f33226d = wo5Var;
                                    wb6Var.f33225c = ag0VarM12798a;
                                    wb6Var.f33227e = f70Var;
                                    wb6Var.f33228f = bt5Var;
                                    wb6Var.f33224b = rr5Var;
                                    VarHandle.storeStoreFence();
                                    ((Executor) wo5Var.f33568c).execute(wb6Var);
                                }
                            } else {
                                boolean zM4443c2 = dc6Var.m4443c();
                                synchronized (dc6Var.f16988e) {
                                    boolean z7 = dc6Var.f16991h;
                                    Log.w("UserMessagingPlatform", "Retry request is not executed. consentInfoUpdateHasBeenCalled=" + zM4443c2 + ", retryRequestIsInProgress=" + z7);
                                }
                            }
                        }
                    }
                    if (dc6Var.m4442b() == i) {
                        Handler handler3 = ky5.f23626a;
                        p62 p62Var3 = new p62((byte) 7);
                        VarHandle.storeStoreFence();
                        handler3.post(p62Var3);
                    } else {
                        ts5 ts5Var = (ts5) gu5Var.f20144d.get();
                        if (ts5Var == null) {
                            Handler handler4 = ky5.f23626a;
                            p62 p62Var4 = new p62((byte) 8);
                            VarHandle.storeStoreFence();
                            handler4.post(p62Var4);
                        } else {
                            ts5Var.m11129a(ag0VarM12798a, c0677g6);
                            Executor executor = gu5Var.f20142b;
                            RunnableC1029pc runnableC1029pc = new RunnableC1029pc((byte) 16);
                            runnableC1029pc.f27515b = gu5Var;
                            VarHandle.storeStoreFence();
                            executor.execute(runnableC1029pc);
                        }
                    }
                }
                return ju4.f22634a;
            case 1:
                zp0.m13682n(((C0723hf) this.f28113b).f20525c, null);
                return ju4.f22634a;
            case 2:
                z62.m13348G((C1366yf) this.f28113b);
                return ju4.f22634a;
            case 3:
                return ((ej4) this.f28113b).mo5136y0();
            case 4:
                return ((u30) ((t30) this.f28113b)).f31634c;
            case 5:
                return ju4.f22634a;
            case 6:
                w94 w94Var = (w94) this.f28113b;
                ArrayList arrayList = new ArrayList();
                ListIterator listIterator = w94Var.listIterator();
                while (true) {
                    ow1 ow1Var = (ow1) listIterator;
                    if (!ow1Var.hasNext()) {
                        return arrayList;
                    }
                    Object next = ow1Var.next();
                    tw2 tw2Var = ((C0800jj) next).f22324c;
                    d83 d83Var = tw2Var.f31486f;
                    d83 d83Var2 = tw2Var.f31487g;
                    if (!((Boolean) d83Var2.getValue()).booleanValue() && z62.m13387o(d83Var.getValue(), d83Var2.getValue()) && !((Boolean) ((d83) tw2Var.f36084a).getValue()).booleanValue() && !((Boolean) d83Var.getValue()).booleanValue()) {
                        arrayList.add(next);
                    }
                }
                break;
            case 7:
                return (C1112rl) this.f28113b;
            case 8:
                return y70.m13010K((Object[]) this.f28113b);
            case 9:
                return (b12) ((C0880lp) this.f28113b).f24255r.getValue();
            case 10:
                return ((ZipInputStream) this.f28113b).getNextEntry();
            case 11:
                j00 j00Var = (j00) this.f28113b;
                BitmapFactory.Options options = new BitmapFactory.Options();
                b63 b63Var = j00Var.f21920b;
                d12 d12Var = j00Var.f21919a;
                g00 g00Var = new g00(d12Var.mo4278j());
                ak3 ak3Var = new ak3(g00Var);
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeStream(new zj3(new ak3(new q93(ak3Var))), null, options);
                Exception exc2 = g00Var.f19456b;
                if (exc2 != null) {
                    throw exc2;
                }
                options.inJustDecodeBounds = false;
                Paint paint = jc1.f22162a;
                String str = options.outMimeType;
                ic1 ic1Var = j00Var.f21922d;
                Set set = kc1.f23062a;
                int iOrdinal = ic1Var.ordinal();
                if (iOrdinal == 0) {
                    xb1Var = xb1.f34129c;
                } else {
                    if (iOrdinal != 1) {
                        if (iOrdinal != 2) {
                            C0670g.m5864c();
                            return null;
                        }
                    } else if (str == null || !kc1.f23062a.contains(str)) {
                        xb1Var = xb1.f34129c;
                    }
                    zj3 zj3Var = new zj3(new ak3(new q93(ak3Var)));
                    fc1 fc1Var = new fc1();
                    fc1Var.f18901a = zj3Var;
                    fc1Var.f18902b = 1073741824;
                    VarHandle.storeStoreFence();
                    boolean z8 = ec1.f17974l;
                    ec1 ec1Var = new ec1();
                    bc1[][] bc1VarArr = ec1.f17965F;
                    ec1Var.f17992d = new HashMap[bc1VarArr.length];
                    ec1Var.f17993e = new HashSet(bc1VarArr.length);
                    ec1Var.f17994f = ByteOrder.BIG_ENDIAN;
                    ec1Var.f17990b = null;
                    ec1Var.f17989a = null;
                    for (int i5 = 0; i5 < bc1VarArr.length; i5++) {
                        try {
                            try {
                                ec1Var.f17992d[i5] = new HashMap();
                            } catch (IOException | UnsupportedOperationException e) {
                                if (z8) {
                                    Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e);
                                }
                                ec1Var.m5057a();
                                if (z8) {
                                }
                                VarHandle.storeStoreFence();
                                ac1VarM5059c = ec1Var.m5059c("Orientation");
                                if (ac1VarM5059c != null) {
                                    iM188e = 1;
                                } else {
                                    try {
                                        iM188e = ac1VarM5059c.m188e(ec1Var.f17994f);
                                    } catch (NumberFormatException unused) {
                                        iM188e = 1;
                                    }
                                }
                                if (iM188e != 2) {
                                    z4 = true;
                                } else {
                                    z4 = true;
                                }
                                ac1VarM5059c2 = ec1Var.m5059c("Orientation");
                                if (ac1VarM5059c2 != null) {
                                    iM188e2 = 1;
                                } else {
                                    try {
                                        iM188e2 = ac1VarM5059c2.m188e(ec1Var.f17994f);
                                    } catch (NumberFormatException unused2) {
                                        iM188e2 = 1;
                                    }
                                }
                                switch (iM188e2) {
                                    case 3:
                                    case 4:
                                        i4 = 180;
                                        break;
                                    case 5:
                                    case 8:
                                        i4 = 270;
                                        break;
                                    case 6:
                                    case 7:
                                        i4 = 90;
                                        break;
                                    default:
                                        i4 = 0;
                                        break;
                                }
                                xb1Var = new xb1(i4, z4);
                            }
                        } catch (Throwable th) {
                            ec1Var.m5057a();
                            if (z8) {
                                ec1Var.m5072p();
                            }
                            throw th;
                        }
                        break;
                    }
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(fc1Var, 5000);
                    int iM5062f = ec1Var.m5062f(bufferedInputStream);
                    ec1Var.f17991c = iM5062f;
                    if (iM5062f == 4 || iM5062f == 9 || iM5062f == 13 || iM5062f == 14) {
                        zb1 zb1Var = new zb1(bufferedInputStream);
                        int i6 = ec1Var.f17991c;
                        if (i6 == 4) {
                            ec1Var.m5061e(zb1Var, 0, 0);
                        } else if (i6 == 13) {
                            ec1Var.m5064h(zb1Var);
                        } else if (i6 == 9) {
                            ec1Var.m5065i(zb1Var);
                        } else if (i6 == 14) {
                            ec1Var.m5068l(zb1Var);
                        }
                    } else {
                        dc1 dc1Var = new dc1(bufferedInputStream);
                        int i7 = ec1Var.f17991c;
                        if (i7 == 12) {
                            ec1Var.m5060d(dc1Var);
                        } else if (i7 == 7) {
                            ec1Var.m5063g(dc1Var);
                        } else if (i7 == 10) {
                            ec1Var.m5067k(dc1Var);
                        } else {
                            ec1Var.m5066j(dc1Var);
                        }
                        dc1Var.m4429b(ec1Var.f17996h);
                        ec1Var.m5076u(dc1Var);
                    }
                    ec1Var.m5057a();
                    if (z8) {
                        ec1Var.m5072p();
                    }
                    VarHandle.storeStoreFence();
                    ac1VarM5059c = ec1Var.m5059c("Orientation");
                    if (ac1VarM5059c != null) {
                        iM188e = ac1VarM5059c.m188e(ec1Var.f17994f);
                    } else {
                        iM188e = 1;
                    }
                    if (iM188e != 2 || iM188e == 7 || iM188e == 4 || iM188e == 5) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    ac1VarM5059c2 = ec1Var.m5059c("Orientation");
                    if (ac1VarM5059c2 != null) {
                        iM188e2 = ac1VarM5059c2.m188e(ec1Var.f17994f);
                    } else {
                        iM188e2 = 1;
                    }
                    switch (iM188e2) {
                        case 3:
                        case 4:
                            i4 = 180;
                            break;
                        case 5:
                        case 8:
                            i4 = 270;
                            break;
                        case 6:
                        case 7:
                            i4 = 90;
                            break;
                        default:
                            i4 = 0;
                            break;
                    }
                    xb1Var = new xb1(i4, z4);
                }
                int i8 = xb1Var.f34131b;
                boolean z9 = xb1Var.f34130a;
                Exception exc3 = g00Var.f19456b;
                if (exc3 != null) {
                    throw exc3;
                }
                options.inMutable = false;
                ColorSpace colorSpace = b63Var.f15111c;
                Context context2 = b63Var.f15109a;
                g74 g74Var = b63Var.f15112d;
                if (colorSpace != null) {
                    options.inPreferredColorSpace = colorSpace;
                }
                options.inPremultiplied = b63Var.f15116h;
                Bitmap.Config config2 = b63Var.f15110b;
                if (!z9) {
                    Set set2 = kc1.f23062a;
                    if (i8 > 0) {
                        if (config2 != null || config2 == Bitmap.Config.HARDWARE) {
                            config2 = Bitmap.Config.ARGB_8888;
                        }
                    }
                } else if (config2 != null) {
                    config2 = Bitmap.Config.ARGB_8888;
                } else {
                    config2 = Bitmap.Config.ARGB_8888;
                }
                if (b63Var.f15115g && config2 == Bitmap.Config.ARGB_8888 && z62.m13387o(options.outMimeType, "image/jpeg")) {
                    config2 = Bitmap.Config.RGB_565;
                }
                Bitmap.Config config3 = options.outConfig;
                Bitmap.Config config4 = Bitmap.Config.RGBA_F16;
                if (config3 == config4 && config2 != Bitmap.Config.HARDWARE) {
                    config2 = config4;
                }
                options.inPreferredConfig = config2;
                zc6 zc6VarMo4277g = d12Var.mo4277g();
                try {
                    if (!(zc6VarMo4277g instanceof uo3) || !z62.m13387o(g74Var, g74.f19639c)) {
                        int i9 = options.outWidth;
                        if (i9 <= 0 || (i2 = options.outHeight) <= 0) {
                            context = context2;
                            options.inSampleSize = 1;
                            z2 = false;
                            options.inScaled = false;
                            bitmapDecodeStream = BitmapFactory.decodeStream(new zj3(ak3Var), null, options);
                            ak3Var.close();
                            exc = g00Var.f19456b;
                            if (exc == null) {
                                throw exc;
                            }
                            if (bitmapDecodeStream == null) {
                                bitmapDecodeStream.setDensity(context.getResources().getDisplayMetrics().densityDpi);
                                Paint paint2 = jc1.f22162a;
                                if (z9) {
                                    matrix = new Matrix();
                                    width = bitmapDecodeStream.getWidth() / 2.0f;
                                    height = bitmapDecodeStream.getHeight() / 2.0f;
                                    if (z9) {
                                        matrix.postScale(-1.0f, 1.0f, width, height);
                                    }
                                    Set set3 = kc1.f23062a;
                                    if (i8 > 0) {
                                        matrix.postRotate(i8, width, height);
                                    }
                                    rectF = new RectF(0.0f, 0.0f, bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight());
                                    matrix.mapRect(rectF);
                                    f = rectF.left;
                                    if (f == 0.0f) {
                                        matrix.postTranslate(-f, -rectF.top);
                                    } else {
                                        matrix.postTranslate(-f, -rectF.top);
                                    }
                                    if (i8 != 90) {
                                        int height2 = bitmapDecodeStream.getHeight();
                                        int width2 = bitmapDecodeStream.getWidth();
                                        config = bitmapDecodeStream.getConfig();
                                        if (config == null) {
                                            config = Bitmap.Config.ARGB_8888;
                                        }
                                        bitmapCreateBitmap = Bitmap.createBitmap(height2, width2, config);
                                    } else {
                                        int height3 = bitmapDecodeStream.getHeight();
                                        int width3 = bitmapDecodeStream.getWidth();
                                        config = bitmapDecodeStream.getConfig();
                                        if (config == null) {
                                            config = Bitmap.Config.ARGB_8888;
                                        }
                                        bitmapCreateBitmap = Bitmap.createBitmap(height3, width3, config);
                                    }
                                    new Canvas(bitmapCreateBitmap).drawBitmap(bitmapDecodeStream, matrix, jc1.f22162a);
                                    bitmapDecodeStream.recycle();
                                    bitmapDecodeStream = bitmapCreateBitmap;
                                } else {
                                    Set set4 = kc1.f23062a;
                                    if (i8 > 0) {
                                        matrix = new Matrix();
                                        width = bitmapDecodeStream.getWidth() / 2.0f;
                                        height = bitmapDecodeStream.getHeight() / 2.0f;
                                        if (z9) {
                                            matrix.postScale(-1.0f, 1.0f, width, height);
                                        }
                                        Set set5 = kc1.f23062a;
                                        if (i8 > 0) {
                                            matrix.postRotate(i8, width, height);
                                        }
                                        rectF = new RectF(0.0f, 0.0f, bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight());
                                        matrix.mapRect(rectF);
                                        f = rectF.left;
                                        if (f == 0.0f || rectF.top != 0.0f) {
                                            matrix.postTranslate(-f, -rectF.top);
                                        }
                                        if (i8 != 90 || i8 == 270) {
                                            int height4 = bitmapDecodeStream.getHeight();
                                            int width4 = bitmapDecodeStream.getWidth();
                                            config = bitmapDecodeStream.getConfig();
                                            if (config == null) {
                                                config = Bitmap.Config.ARGB_8888;
                                            }
                                            bitmapCreateBitmap = Bitmap.createBitmap(height4, width4, config);
                                        } else {
                                            int width5 = bitmapDecodeStream.getWidth();
                                            int height5 = bitmapDecodeStream.getHeight();
                                            Bitmap.Config config5 = bitmapDecodeStream.getConfig();
                                            if (config5 == null) {
                                                config5 = Bitmap.Config.ARGB_8888;
                                            }
                                            bitmapCreateBitmap = Bitmap.createBitmap(width5, height5, config5);
                                        }
                                        new Canvas(bitmapCreateBitmap).drawBitmap(bitmapDecodeStream, matrix, jc1.f22162a);
                                        bitmapDecodeStream.recycle();
                                        bitmapDecodeStream = bitmapCreateBitmap;
                                    }
                                }
                                BitmapDrawable bitmapDrawable = new BitmapDrawable(context.getResources(), bitmapDecodeStream);
                                if (options.inSampleSize <= 1 || options.inScaled) {
                                    z3 = true;
                                } else {
                                    z3 = z2;
                                }
                                hv0 hv0Var = new hv0();
                                hv0Var.f20888a = bitmapDrawable;
                                hv0Var.f20889b = z3;
                                VarHandle.storeStoreFence();
                                return hv0Var;
                            }
                            C1077qn.m9989o("BitmapFactory returned a null bitmap. Often this means BitmapFactory could not decode the image data read from the input source (e.g. network, disk, or memory) as it's not encoded as a valid image format.");
                        } else {
                            int i10 = (i8 == 90 || i8 == 270) ? i2 : i9;
                            if (i8 != 90 && i8 != 270) {
                                i9 = i2;
                            }
                            qv3 qv3Var = b63Var.f15113e;
                            g74 g74Var2 = g74.f19639c;
                            int iM6201d = z62.m13387o(g74Var, g74Var2) ? i10 : AbstractC0707h.m6201d(g74Var.f19640a, qv3Var);
                            int iM6201d2 = z62.m13387o(g74Var, g74Var2) ? i9 : AbstractC0707h.m6201d(g74Var.f19641b, qv3Var);
                            int iHighestOneBit = Integer.highestOneBit(i10 / iM6201d);
                            int iHighestOneBit2 = Integer.highestOneBit(i9 / iM6201d2);
                            int iOrdinal2 = qv3Var.ordinal();
                            if (iOrdinal2 != 0) {
                                i3 = 1;
                                if (iOrdinal2 == 1) {
                                    iMin = Math.max(iHighestOneBit, iHighestOneBit2);
                                } else {
                                    C0670g.m5864c();
                                }
                            } else {
                                i3 = 1;
                                iMin = Math.min(iHighestOneBit, iHighestOneBit2);
                            }
                            if (iMin < i3) {
                                iMin = 1;
                            }
                            options.inSampleSize = iMin;
                            double d = iMin;
                            double d2 = ((double) i9) / d;
                            context = context2;
                            double d3 = ((double) iM6201d) / (((double) i10) / d);
                            double d4 = ((double) iM6201d2) / d2;
                            int iOrdinal3 = qv3Var.ordinal();
                            if (iOrdinal3 == 0) {
                                dMax = Math.max(d3, d4);
                            } else if (iOrdinal3 == 1) {
                                dMax = Math.min(d3, d4);
                            } else {
                                C0670g.m5864c();
                            }
                            if (b63Var.f15114f && dMax > 1.0d) {
                                dMax = 1.0d;
                            }
                            boolean z10 = dMax == 1.0d;
                            options.inScaled = !z10;
                            if (!z10) {
                                if (dMax > 1.0d) {
                                    options.inDensity = qq2.m10009D(2.147483647E9d / dMax);
                                    options.inTargetDensity = Integer.MAX_VALUE;
                                } else {
                                    options.inDensity = Integer.MAX_VALUE;
                                    options.inTargetDensity = qq2.m10009D(2.147483647E9d * dMax);
                                }
                            }
                        }
                        return null;
                    }
                    options.inSampleSize = 1;
                    options.inScaled = true;
                    options.inDensity = ((uo3) zc6VarMo4277g).f32032j;
                    options.inTargetDensity = context2.getResources().getDisplayMetrics().densityDpi;
                    context = context2;
                    bitmapDecodeStream = BitmapFactory.decodeStream(new zj3(ak3Var), null, options);
                    ak3Var.close();
                    exc = g00Var.f19456b;
                    if (exc == null) {
                        throw exc;
                    }
                    if (bitmapDecodeStream == null) {
                        C1077qn.m9989o("BitmapFactory returned a null bitmap. Often this means BitmapFactory could not decode the image data read from the input source (e.g. network, disk, or memory) as it's not encoded as a valid image format.");
                        return null;
                    }
                    bitmapDecodeStream.setDensity(context.getResources().getDisplayMetrics().densityDpi);
                    Paint paint3 = jc1.f22162a;
                    if (z9) {
                        Set set6 = kc1.f23062a;
                        if (i8 > 0) {
                            matrix = new Matrix();
                            width = bitmapDecodeStream.getWidth() / 2.0f;
                            height = bitmapDecodeStream.getHeight() / 2.0f;
                            if (z9) {
                                matrix.postScale(-1.0f, 1.0f, width, height);
                            }
                            Set set7 = kc1.f23062a;
                            if (i8 > 0) {
                                matrix.postRotate(i8, width, height);
                            }
                            rectF = new RectF(0.0f, 0.0f, bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight());
                            matrix.mapRect(rectF);
                            f = rectF.left;
                            if (f == 0.0f) {
                                matrix.postTranslate(-f, -rectF.top);
                            } else {
                                matrix.postTranslate(-f, -rectF.top);
                            }
                            if (i8 != 90) {
                                int height6 = bitmapDecodeStream.getHeight();
                                int width6 = bitmapDecodeStream.getWidth();
                                config = bitmapDecodeStream.getConfig();
                                if (config == null) {
                                    config = Bitmap.Config.ARGB_8888;
                                }
                                bitmapCreateBitmap = Bitmap.createBitmap(height6, width6, config);
                            } else {
                                int height7 = bitmapDecodeStream.getHeight();
                                int width7 = bitmapDecodeStream.getWidth();
                                config = bitmapDecodeStream.getConfig();
                                if (config == null) {
                                    config = Bitmap.Config.ARGB_8888;
                                }
                                bitmapCreateBitmap = Bitmap.createBitmap(height7, width7, config);
                            }
                            new Canvas(bitmapCreateBitmap).drawBitmap(bitmapDecodeStream, matrix, jc1.f22162a);
                            bitmapDecodeStream.recycle();
                            bitmapDecodeStream = bitmapCreateBitmap;
                        }
                    } else {
                        matrix = new Matrix();
                        width = bitmapDecodeStream.getWidth() / 2.0f;
                        height = bitmapDecodeStream.getHeight() / 2.0f;
                        if (z9) {
                            matrix.postScale(-1.0f, 1.0f, width, height);
                        }
                        Set set8 = kc1.f23062a;
                        if (i8 > 0) {
                            matrix.postRotate(i8, width, height);
                        }
                        rectF = new RectF(0.0f, 0.0f, bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight());
                        matrix.mapRect(rectF);
                        f = rectF.left;
                        if (f == 0.0f) {
                            matrix.postTranslate(-f, -rectF.top);
                        } else {
                            matrix.postTranslate(-f, -rectF.top);
                        }
                        if (i8 != 90) {
                            int height8 = bitmapDecodeStream.getHeight();
                            int width8 = bitmapDecodeStream.getWidth();
                            config = bitmapDecodeStream.getConfig();
                            if (config == null) {
                                config = Bitmap.Config.ARGB_8888;
                            }
                            bitmapCreateBitmap = Bitmap.createBitmap(height8, width8, config);
                        } else {
                            int height9 = bitmapDecodeStream.getHeight();
                            int width9 = bitmapDecodeStream.getWidth();
                            config = bitmapDecodeStream.getConfig();
                            if (config == null) {
                                config = Bitmap.Config.ARGB_8888;
                            }
                            bitmapCreateBitmap = Bitmap.createBitmap(height9, width9, config);
                        }
                        new Canvas(bitmapCreateBitmap).drawBitmap(bitmapDecodeStream, matrix, jc1.f22162a);
                        bitmapDecodeStream.recycle();
                        bitmapDecodeStream = bitmapCreateBitmap;
                    }
                    BitmapDrawable bitmapDrawable2 = new BitmapDrawable(context.getResources(), bitmapDecodeStream);
                    if (options.inSampleSize <= 1) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    hv0 hv0Var2 = new hv0();
                    hv0Var2.f20888a = bitmapDrawable2;
                    hv0Var2.f20889b = z3;
                    VarHandle.storeStoreFence();
                    return hv0Var2;
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        lb5.m7941v(ak3Var, th2);
                        throw th3;
                    }
                }
                z2 = false;
                break;
                break;
            case 12:
                return (jl3) this.f28113b;
            case 13:
                return ((Iterable) this.f28113b).iterator();
            case 14:
                wp1 wp1Var = ((rd0) this.f28113b).f29165K;
                if (wp1Var != null) {
                    wp1Var.invoke();
                }
                return Boolean.TRUE;
            case 15:
                return k43.m7398w(this.f28113b);
            case 16:
                ((Activity) this.f28113b).finish();
                return ju4.f22634a;
            case 17:
                ii0 ii0Var = (ii0) this.f28113b;
                boolean zM12108c = w52.m12108c(0L, 0L);
                View view = ii0Var.f21434a;
                if (zM12108c) {
                    Context context3 = view.getContext();
                    Context baseContext = context3;
                    while (baseContext instanceof ContextWrapper) {
                        if ((baseContext instanceof Activity) || (baseContext instanceof InputMethodService) || (baseContext instanceof Application)) {
                            r13 = baseContext;
                        } else {
                            ContextWrapper contextWrapper = (ContextWrapper) baseContext;
                            if (contextWrapper.getBaseContext() != null) {
                                baseContext = contextWrapper.getBaseContext();
                            }
                        }
                        if (r13 != 0) {
                            f15.f18662a.getClass();
                            e15 e15Var = e15.f17635a;
                            e15 e15Var2 = e15.f17635a;
                            if (Build.VERSION.SDK_INT >= 34) {
                                r0 = i15.f21015a;
                            } else {
                                r0 = o85.f26459s;
                            }
                            d15 d15VarMo6203c = r0.mo6203c(r13);
                            long jHeight = (((long) d15VarMo6203c.m4280a().height()) & 4294967295L) | (((long) d15VarMo6203c.m4280a().width()) << 32);
                            return new ty0(jHeight, gq6.m6078c(r13).mo3574D(z62.m13369a0(jHeight)));
                        }
                        Configuration configuration = context3.getResources().getConfiguration();
                        my0 my0VarM6078c = gq6.m6078c(context3);
                        long jM4704f = dt0.m4704f(configuration.screenWidthDp, configuration.screenHeightDp);
                        long jMo3581c0 = my0VarM6078c.mo3581c0(jM4704f);
                        ty0Var = new ty0((((long) ((int) Float.intBitsToFloat((int) (jMo3581c0 & 4294967295L)))) & 4294967295L) | (((long) ((int) Float.intBitsToFloat((int) (jMo3581c0 >> 32)))) << 32), jM4704f);
                    }
                    if (r13 != 0) {
                        f15.f18662a.getClass();
                        e15 e15Var3 = e15.f17635a;
                        e15 e15Var4 = e15.f17635a;
                        if (Build.VERSION.SDK_INT >= 34) {
                            r0 = i15.f21015a;
                        } else {
                            r0 = o85.f26459s;
                        }
                        d15 d15VarMo6203c2 = r0.mo6203c(r13);
                        long jHeight2 = (((long) d15VarMo6203c2.m4280a().height()) & 4294967295L) | (((long) d15VarMo6203c2.m4280a().width()) << 32);
                        return new ty0(jHeight2, gq6.m6078c(r13).mo3574D(z62.m13369a0(jHeight2)));
                    }
                    Configuration configuration2 = context3.getResources().getConfiguration();
                    my0 my0VarM6078c2 = gq6.m6078c(context3);
                    long jM4704f2 = dt0.m4704f(configuration2.screenWidthDp, configuration2.screenHeightDp);
                    long jMo3581c1 = my0VarM6078c2.mo3581c0(jM4704f2);
                    ty0Var = new ty0((((long) ((int) Float.intBitsToFloat((int) (jMo3581c1 & 4294967295L)))) & 4294967295L) | (((long) ((int) Float.intBitsToFloat((int) (jMo3581c1 >> 32)))) << 32), jM4704f2);
                } else {
                    ty0Var = new ty0(0L, gq6.m6078c(view.getContext()).mo3574D(z62.m13369a0(0L)));
                }
                return ty0Var;
            case 18:
                throw new IllegalStateException(("CompositionLocal " + ((i60) ((ic2) this.f28113b)).getName() + " not present").toString());
            case 19:
                return ((uj2) this.f28113b).m11577d();
            case 20:
                return new hk4((d63) this.f28113b, 0.0f);
            case 21:
                ((pj4) this.f28113b).close();
                return ju4.f22634a;
            case 22:
                C1354y3 c1354y3 = (C1354y3) this.f28113b;
                Integer numValueOf = 0;
                ListIterator listIterator2 = c1354y3.f34831d.listIterator();
                Integer numValueOf2 = numValueOf;
                while (true) {
                    ow1 ow1Var2 = (ow1) listIterator2;
                    if (ow1Var2.hasNext()) {
                        numValueOf2 = Integer.valueOf(numValueOf2.intValue() | ((C0004a3) ow1Var2.next()).f71a);
                    } else {
                        ListIterator listIterator3 = c1354y3.f34831d.listIterator();
                        while (true) {
                            ow1 ow1Var3 = (ow1) listIterator3;
                            if (!ow1Var3.hasNext()) {
                                return new l73(numValueOf2, numValueOf);
                            }
                            numValueOf = Integer.valueOf(((C0004a3) ow1Var3.next()).f72b | numValueOf.intValue());
                        }
                    }
                }
                break;
            case 23:
                EsApp esApp = (EsApp) this.f28113b;
                if (esApp.f18451a) {
                    C1077qn.m9989o("Reentrant call to appCompositionContext");
                    return null;
                }
                esApp.f18451a = true;
                C0928n c0928n = new C0928n(b4);
                c0928n.f25353b = esApp;
                VarHandle.storeStoreFence();
                pg0 pg0Var = new pg0(1569748607, true, c0928n);
                ss1.m10910a();
                ro0 ro0Var = (ro0) C0946nh.f25787l.getValue();
                vy4 vy4Var = new vy4();
                vy4Var.f32971a = ev0.m5333H(-1, null, null, 6);
                sj4 sj4Var = new sj4(b3);
                sj4Var.f30344b = vy4Var;
                VarHandle.storeStoreFence();
                vy4Var.f32972b = new C1034ph(sj4Var);
                VarHandle.storeStoreFence();
                vt2 vt2VarM84v = C0006a5.m84v(ro0Var);
                C1034ph c1034ph = new C1034ph(b5);
                c1034ph.f27603b = vt2VarM84v;
                c1034ph.f27604c = vy4Var;
                VarHandle.storeStoreFence();
                um0 um0VarM13670b = zp0.m13670b(qs5.m10089N(AbstractC0647fd.m5675m(), ro0Var).plus(c1034ph));
                pw0 pw0Var = l01.f23664a;
                cp0 cp0Var = cp0.f16328d;
                byte b6 = 18;
                lb5.m7909R(um0VarM13670b, pw0Var, cp0Var, new C0594e0(vy4Var, ro0Var, (wm0) r13, b6));
                el3 el3Var = new el3(um0VarM13670b.f31989a);
                lb5.m7910S(um0VarM13670b, null, cp0Var, new C0982og(el3Var, (wm0) r13, b), 1);
                ql3 ql3Var = new ql3();
                zi0 zi0Var = new zi0(el3Var, ku4.f23525h);
                ne0 ne0Var = new ne0(b6);
                ne0Var.f25728b = pg0Var;
                ne0Var.f25729c = ql3Var;
                VarHandle.storeStoreFence();
                zi0Var.m13573B(new pg0(2062842012, true, ne0Var));
                Object obj = ql3Var.f28555a;
                if (obj == null) {
                    z62.m13366Y("context");
                    throw null;
                }
                ui0 ui0Var = (ui0) obj;
                esApp.f18451a = false;
                return ui0Var;
            case 24:
                tn2 tn2Var = (tn2) this.f28113b;
                int i11 = EsApp.f18450c;
                return (pn2[]) AbstractC0990oo.m9209d0(new pn2[]{vd6.m11828L(), tn2Var != null ? tn2Var.f31261b : null}).toArray(new pn2[0]);
            case 25:
                od1 od1Var = (od1) this.f28113b;
                Boolean bool = (Boolean) od1Var.f26640e.getValue();
                Boolean bool2 = Boolean.TRUE;
                boolean zM13387o = z62.m13387o(bool, bool2);
                qe3 qe3Var = od1Var.f26639d;
                if (zM13387o && z62.m13387o(od1Var.f26637b.mo11770a(), bool2) && (z62.m13387o(qe3Var.mo9873f(), bool2) || qe3Var.mo9868a())) {
                    z5 = true;
                }
                return Boolean.valueOf(z5);
            case 26:
                File file = (File) this.f28113b;
                synchronized (cf1.f15976e) {
                    cf1.f15975d.remove(file.getAbsolutePath());
                }
                return ju4.f22634a;
            case 27:
                ((sl1) this.f28113b).m10855Q0();
                return ju4.f22634a;
            case 28:
                zo1 zo1Var = (zo1) this.f28113b;
                String str2 = zo1Var.f36214b;
                yo1 yo1Var = (str2 == null || !zo1Var.f36216d) ? new yo1(zo1Var.f36213a, zo1Var.f36214b, new js1((byte) 23), zo1Var.f36215c, zo1Var.f36217e) : new yo1(zo1Var.f36213a, new File(zo1Var.f36213a.getNoBackupFilesDir(), str2).getAbsolutePath(), new js1((byte) 23), zo1Var.f36215c, zo1Var.f36217e);
                yo1Var.setWriteAheadLoggingEnabled(zo1Var.f36219g);
                return yo1Var;
            default:
                ((lv1) this.f28113b).m8115a(nv1.m8859d());
                return ju4.f22634a;
        }
    }
}
