package androidx.compose.p001ui.tooling;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import java.lang.invoke.VarHandle;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import p000.C0712h4;
import p000.C1077qn;
import p000.ag0;
import p000.bg0;
import p000.er1;
import p000.hd4;
import p000.oe2;
import p000.pg0;
import p000.zi4;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class PreviewActivity extends ag0 {

    /* JADX INFO: renamed from: w */
    public static final /* synthetic */ int f14656w = 0;

    /* JADX INFO: renamed from: v */
    public final String f14657v = "PreviewActivity";

    @Override // p000.ag0, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        String stringExtra;
        Class<?> cls;
        super.onCreate(bundle);
        int i = getApplicationInfo().flags & 2;
        String str = this.f14657v;
        if (i == 0) {
            Log.d(str, "Application is not debuggable. Compose Preview not allowed.");
            finish();
            return;
        }
        Intent intent = getIntent();
        if (intent == null || (stringExtra = intent.getStringExtra("composable")) == null) {
            return;
        }
        Log.d(str, "PreviewActivity has composable ".concat(stringExtra));
        String strM6356v0 = hd4.m6356v0(stringExtra, '.');
        String strM6355u0 = hd4.m6355u0('.', stringExtra, stringExtra);
        String stringExtra2 = getIntent().getStringExtra("parameterProviderClassName");
        if (stringExtra2 == null) {
            Log.d(str, "Previewing '" + strM6355u0 + "' without a parameter provider.");
            er1 er1Var = new er1((byte) 9);
            er1Var.f18412b = strM6356v0;
            er1Var.f18413c = strM6355u0;
            VarHandle.storeStoreFence();
            bg0.m3568a(this, null, new pg0(-840626948, true, er1Var));
            return;
        }
        Log.d(str, zi4.m13622v("Previewing '", strM6355u0, "' with parameter provider: '", stringExtra2, "'"));
        try {
            cls = Class.forName(stringExtra2);
        } catch (ClassNotFoundException e) {
            Log.e("PreviewLogger", "Unable to find PreviewProvider '" + stringExtra2 + "'", e);
            cls = null;
        }
        getIntent().getIntExtra("parameterProviderIndex", -1);
        int i2 = 0;
        if (cls == null) {
            C0712h4 c0712h4 = new C0712h4((byte) 7);
            c0712h4.f20357b = strM6356v0;
            c0712h4.f20358c = strM6355u0;
            c0712h4.f20359d = new Object[0];
            VarHandle.storeStoreFence();
            bg0.m3568a(this, null, new pg0(-1901447514, true, c0712h4));
            return;
        }
        try {
            Constructor<?>[] constructors = cls.getConstructors();
            int length = constructors.length;
            boolean z = false;
            Constructor<?> constructor = null;
            while (true) {
                if (i2 >= length) {
                    if (z) {
                        break;
                    }
                } else {
                    Constructor<?> constructor2 = constructors[i2];
                    if (constructor2.getParameterTypes().length == 0) {
                        if (!z) {
                            constructor = constructor2;
                            z = true;
                        }
                    }
                    i2++;
                }
                constructor = null;
                break;
            }
            if (constructor == null) {
                throw new IllegalArgumentException("PreviewParameterProvider constructor can not have parameters");
            }
            constructor.setAccessible(true);
            constructor.newInstance(null);
            throw new ClassCastException();
        } catch (oe2 unused) {
            C1077qn.m9989o("Deploying Compose Previews with PreviewParameterProvider arguments requires adding a dependency to the kotlin-reflect library.\nConsider adding 'debugImplementation \"org.jetbrains.kotlin:kotlin-reflect:$kotlin_version\"' to the module's build.gradle.");
        }
    }
}
