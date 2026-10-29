package p000;

import android.R;
import android.app.AlertDialog;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.gms.common.api.GoogleApiActivity;
import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.Iterator;
import org.chromium.net.C0995R;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class pt1 extends qt1 {

    /* JADX INFO: renamed from: c */
    public static final Object f27969c = new Object();

    /* JADX INFO: renamed from: d */
    public static final pt1 f27970d = new pt1();

    @Override // p000.qt1
    /* JADX INFO: renamed from: a */
    public final Intent mo9664a(Context context, int i, String str) {
        return super.mo9664a(context, i, str);
    }

    /* JADX INFO: renamed from: c */
    public final void m9665c(GoogleApiActivity googleApiActivity, int i, GoogleApiActivity googleApiActivity2) {
        String string;
        AlertDialog alertDialogCreate;
        Intent intentMo9664a = super.mo9664a(googleApiActivity, i, "d");
        yl5 yl5Var = new yl5();
        yl5Var.f35317a = intentMo9664a;
        yl5Var.f35318b = googleApiActivity;
        VarHandle.storeStoreFence();
        if (i == 0) {
            alertDialogCreate = null;
        } else {
            TypedValue typedValue = new TypedValue();
            googleApiActivity.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
            AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(googleApiActivity.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(googleApiActivity, 5) : null;
            if (builder == null) {
                builder = new AlertDialog.Builder(googleApiActivity);
            }
            builder.setMessage(rl5.m10364b(googleApiActivity, i));
            if (googleApiActivity2 != null) {
                builder.setOnCancelListener(googleApiActivity2);
            }
            Resources resources = googleApiActivity.getResources();
            if (i == 1) {
                string = resources.getString(C0995R.string.common_google_play_services_install_button);
            } else if (i != 2) {
                string = i != 3 ? resources.getString(R.string.ok) : resources.getString(C0995R.string.common_google_play_services_enable_button);
            } else {
                string = resources.getString(C0995R.string.common_google_play_services_update_button);
            }
            if (string != null) {
                builder.setPositiveButton(string, yl5Var);
            }
            String strM10365c = rl5.m10365c(googleApiActivity, i);
            if (strM10365c != null) {
                builder.setTitle(strM10365c);
            }
            Log.w("GoogleApiAvailability", c75.m3877i(i, "Creating dialog for Google Play services availability issue. ConnectionResult="), new IllegalArgumentException());
            alertDialogCreate = builder.create();
        }
        if (alertDialogCreate == null) {
            return;
        }
        FragmentManager fragmentManager = googleApiActivity.getFragmentManager();
        da1 da1Var = new da1();
        y42.m12855b0(alertDialogCreate, "Cannot display null dialog");
        alertDialogCreate.setOnCancelListener(null);
        alertDialogCreate.setOnDismissListener(null);
        da1Var.f16880a = alertDialogCreate;
        if (googleApiActivity2 != null) {
            da1Var.f16881b = googleApiActivity2;
        }
        da1Var.show(fragmentManager, "GooglePlayServicesErrorDialog");
    }

    /* JADX WARN: Code duplicated, block: B:115:0x0316  */
    /* JADX WARN: Code duplicated, block: B:118:0x031f  */
    /* JADX INFO: renamed from: d */
    public final void m9666d(Context context, int i, PendingIntent pendingIntent) {
        int i2;
        Bundle bundle;
        IconCompat iconCompat;
        int i3;
        byte b;
        Icon iconCreateWithBitmap;
        String resPackage;
        ColorStateList colorStateList;
        PorterDuff.Mode mode;
        Uri uri;
        int i4;
        Log.w("GoogleApiAvailability", c75.m3878j("GMS core API Availability. ConnectionResult=", i, ", tag=null"), new IllegalArgumentException());
        if (i == 18) {
            new am5(this, context).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        if (pendingIntent == null) {
            if (i == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String strM10367e = i == 6 ? rl5.m10367e(context, "common_google_play_services_resolution_required_title") : rl5.m10365c(context, i);
        if (strM10367e == null) {
            strM10367e = context.getResources().getString(C0995R.string.common_google_play_services_notification_ticker);
        }
        String strM10366d = (i == 6 || i == 19) ? rl5.m10366d(context, "common_google_play_services_resolution_required_text", rl5.m10363a(context)) : rl5.m10364b(context, i);
        Resources resources = context.getResources();
        Object systemService = context.getSystemService("notification");
        y42.m12854a0(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        x13 x13Var = new x13();
        ArrayList arrayList = new ArrayList();
        x13Var.f33913a = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        x13Var.f33918f = true;
        x13Var.f33920h = false;
        Notification notification = new Notification();
        x13Var.f33922j = null;
        String str = strM10366d;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        x13Var.f33917e = (byte) 0;
        x13Var.f33924l = new ArrayList();
        x13Var.f33923k = true;
        x13Var.f33920h = true;
        notification.flags |= 16;
        x13Var.f33914b = x13.m12459a(strM10367e);
        nh3 nh3Var = new nh3((byte) 24, false);
        nh3Var.f25811c = x13.m12459a(str);
        x13Var.m12460b(nh3Var);
        PackageManager packageManager = context.getPackageManager();
        Boolean boolValueOf = AbstractC0647fd.f18916f;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
            AbstractC0647fd.f18916f = boolValueOf;
        }
        if (boolValueOf.booleanValue()) {
            notification.icon = context.getApplicationInfo().icon;
            x13Var.f33917e = (byte) 2;
            if (AbstractC0647fd.m5644B(context)) {
                String string = resources.getString(C0995R.string.common_open_on_phone);
                IconCompat iconCompatM3055a = IconCompat.m3055a(2131230725);
                Bundle bundle2 = new Bundle();
                w13 w13Var = new w13();
                w13Var.f33024b = iconCompatM3055a;
                if (iconCompatM3055a != null) {
                    int type = iconCompatM3055a.f14665a;
                    if (type == -1) {
                        type = ((Icon) iconCompatM3055a.f14666b).getType();
                    }
                    if (type == 2) {
                        w13Var.f33026d = iconCompatM3055a.m3056b();
                    }
                }
                w13Var.f33027e = x13.m12459a(string);
                w13Var.f33028f = pendingIntent;
                w13Var.f33023a = bundle2;
                w13Var.f33025c = true;
                VarHandle.storeStoreFence();
                arrayList.add(w13Var);
            } else {
                x13Var.f33916d = pendingIntent;
            }
        } else {
            notification.icon = R.drawable.stat_sys_warning;
            notification.tickerText = x13.m12459a(resources.getString(C0995R.string.common_google_play_services_notification_ticker));
            notification.when = System.currentTimeMillis();
            x13Var.f33916d = pendingIntent;
            x13Var.f33915c = x13.m12459a(str);
        }
        synchronized (f27969c) {
        }
        NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
        String string2 = context.getResources().getString(C0995R.string.common_google_play_services_notification_channel_name);
        if (notificationChannel == null) {
            notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", string2, 4));
        } else if (!string2.contentEquals(notificationChannel.getName())) {
            notificationChannel.setName(string2);
            notificationManager.createNotificationChannel(notificationChannel);
        }
        x13Var.f33922j = "com.google.android.gms.availability";
        Bundle bundle3 = new Bundle();
        Notification.Builder builder = new Notification.Builder(context, x13Var.f33922j);
        builder.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(x13Var.f33914b).setContentText(x13Var.f33915c).setContentInfo(null).setContentIntent(x13Var.f33916d).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) != 0).setNumber(0).setProgress(0, 0, false);
        builder.setLargeIcon((Icon) null);
        builder.setSubText(null).setUsesChronometer(false).setPriority(x13Var.f33917e);
        int size = arrayList.size();
        int i5 = 0;
        while (i5 < size) {
            int i6 = i5 + 1;
            w13 w13Var2 = (w13) arrayList.get(i5);
            IconCompat iconCompatM3055a2 = w13Var2.f33024b;
            if (iconCompatM3055a2 == null && (i4 = w13Var2.f33026d) != 0) {
                iconCompatM3055a2 = IconCompat.m3055a(i4);
                w13Var2.f33024b = iconCompatM3055a2;
            }
            boolean z = w13Var2.f33025c;
            Bundle bundle4 = w13Var2.f33023a;
            int i7 = size;
            if (iconCompatM3055a2 != null) {
                int i8 = iconCompatM3055a2.f14665a;
                switch (i8) {
                    case -1:
                        arrayList = arrayList;
                        i6 = i6;
                        b = -1;
                        iconCreateWithBitmap = (Icon) iconCompatM3055a2.f14666b;
                        break;
                    case 0:
                    default:
                        C1077qn.m9987m("Unknown type");
                        return;
                    case 1:
                        arrayList = arrayList;
                        i6 = i6;
                        b = -1;
                        iconCreateWithBitmap = Icon.createWithBitmap((Bitmap) iconCompatM3055a2.f14666b);
                        colorStateList = iconCompatM3055a2.f14671g;
                        if (colorStateList != null) {
                            iconCreateWithBitmap.setTintList(colorStateList);
                        }
                        mode = iconCompatM3055a2.f14672h;
                        if (mode != IconCompat.f14664k) {
                            iconCreateWithBitmap.setTintMode(mode);
                        }
                        break;
                    case 2:
                        arrayList = arrayList;
                        i6 = i6;
                        if (i8 == -1) {
                            resPackage = ((Icon) iconCompatM3055a2.f14666b).getResPackage();
                        } else {
                            if (i8 != 2) {
                                wb1.m12196p(iconCompatM3055a2, "called getResPackage() on ");
                                return;
                            }
                            String str2 = iconCompatM3055a2.f14674j;
                            if (str2 == null || TextUtils.isEmpty(str2)) {
                                b = -1;
                                resPackage = ((String) iconCompatM3055a2.f14666b).split(":", -1)[0];
                            } else {
                                resPackage = iconCompatM3055a2.f14674j;
                            }
                            iconCreateWithBitmap = Icon.createWithResource(resPackage, iconCompatM3055a2.f14669e);
                            colorStateList = iconCompatM3055a2.f14671g;
                            if (colorStateList != null) {
                                iconCreateWithBitmap.setTintList(colorStateList);
                            }
                            mode = iconCompatM3055a2.f14672h;
                            if (mode != IconCompat.f14664k) {
                                iconCreateWithBitmap.setTintMode(mode);
                            }
                        }
                        b = -1;
                        iconCreateWithBitmap = Icon.createWithResource(resPackage, iconCompatM3055a2.f14669e);
                        colorStateList = iconCompatM3055a2.f14671g;
                        if (colorStateList != null) {
                            iconCreateWithBitmap.setTintList(colorStateList);
                        }
                        mode = iconCompatM3055a2.f14672h;
                        if (mode != IconCompat.f14664k) {
                            iconCreateWithBitmap.setTintMode(mode);
                        }
                        break;
                    case 3:
                        arrayList = arrayList;
                        iconCreateWithBitmap = Icon.createWithData((byte[]) iconCompatM3055a2.f14666b, iconCompatM3055a2.f14669e, iconCompatM3055a2.f14670f);
                        b = -1;
                        colorStateList = iconCompatM3055a2.f14671g;
                        if (colorStateList != null) {
                            iconCreateWithBitmap.setTintList(colorStateList);
                        }
                        mode = iconCompatM3055a2.f14672h;
                        if (mode != IconCompat.f14664k) {
                            iconCreateWithBitmap.setTintMode(mode);
                        }
                        break;
                    case 4:
                        iconCreateWithBitmap = Icon.createWithContentUri((String) iconCompatM3055a2.f14666b);
                        b = -1;
                        colorStateList = iconCompatM3055a2.f14671g;
                        if (colorStateList != null) {
                            iconCreateWithBitmap.setTintList(colorStateList);
                        }
                        mode = iconCompatM3055a2.f14672h;
                        if (mode != IconCompat.f14664k) {
                            iconCreateWithBitmap.setTintMode(mode);
                        }
                        break;
                    case 5:
                        iconCreateWithBitmap = Icon.createWithAdaptiveBitmap((Bitmap) iconCompatM3055a2.f14666b);
                        b = -1;
                        colorStateList = iconCompatM3055a2.f14671g;
                        if (colorStateList != null) {
                            iconCreateWithBitmap.setTintList(colorStateList);
                        }
                        mode = iconCompatM3055a2.f14672h;
                        if (mode != IconCompat.f14664k) {
                            iconCreateWithBitmap.setTintMode(mode);
                        }
                        break;
                    case 6:
                        if (i8 == -1) {
                            uri = ((Icon) iconCompatM3055a2.f14666b).getUri();
                        } else {
                            if (i8 != 4 && i8 != 6) {
                                wb1.m12196p(iconCompatM3055a2, "called getUri() on ");
                                return;
                            }
                            uri = Uri.parse((String) iconCompatM3055a2.f14666b);
                        }
                        iconCreateWithBitmap = Icon.createWithAdaptiveBitmapContentUri(uri);
                        b = -1;
                        colorStateList = iconCompatM3055a2.f14671g;
                        if (colorStateList != null) {
                            iconCreateWithBitmap.setTintList(colorStateList);
                        }
                        mode = iconCompatM3055a2.f14672h;
                        if (mode != IconCompat.f14664k) {
                            iconCreateWithBitmap.setTintMode(mode);
                        }
                        break;
                }
            } else {
                arrayList = arrayList;
                i6 = i6;
                b = -1;
                iconCreateWithBitmap = null;
            }
            Notification.Action.Builder builder2 = new Notification.Action.Builder(iconCreateWithBitmap, w13Var2.f33027e, w13Var2.f33028f);
            Bundle bundle5 = bundle4 != null ? new Bundle(bundle4) : new Bundle();
            bundle5.putBoolean("android.support.allowGeneratedReplies", z);
            builder2.setAllowGeneratedReplies(z);
            bundle5.putInt("android.support.action.semanticAction", 0);
            builder2.setSemanticAction(0);
            builder2.setContextual(false);
            builder2.setAuthenticationRequired(false);
            if (Build.VERSION.SDK_INT >= 37) {
                AbstractC1214uc.m11530a(builder2);
                AbstractC1214uc.m11532c(builder2);
            }
            bundle5.putBoolean("android.support.action.showsUserInterface", true);
            builder2.addExtras(bundle5);
            builder.addAction(builder2.build());
            size = i7;
            arrayList = arrayList;
            i5 = i6;
        }
        Bundle bundle6 = x13Var.f33921i;
        if (bundle6 != null) {
            bundle3.putAll(bundle6);
        }
        builder.setShowWhen(x13Var.f33918f);
        builder.setLocalOnly(x13Var.f33920h);
        builder.setGroup(null);
        builder.setSortKey(null);
        builder.setGroupSummary(false);
        builder.setCategory(null);
        builder.setColor(0);
        builder.setVisibility(0);
        builder.setPublicVersion(null);
        builder.setSound(notification.sound, notification.audioAttributes);
        ArrayList arrayList3 = x13Var.f33924l;
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            int size2 = arrayList3.size();
            int i9 = 0;
            while (i9 < size2) {
                Object obj = arrayList3.get(i9);
                i9++;
                builder.addPerson((String) obj);
            }
        }
        if (arrayList2.size() > 0) {
            Bundle bundle7 = x13Var.f33921i;
            if (bundle7 == null) {
                bundle7 = new Bundle();
                x13Var.f33921i = bundle7;
            }
            Bundle bundle8 = bundle7.getBundle("android.car.EXTENSIONS");
            if (bundle8 == null) {
                bundle8 = new Bundle();
            }
            Bundle bundle9 = new Bundle(bundle8);
            Bundle bundle10 = new Bundle();
            int i10 = 0;
            while (i10 < arrayList2.size()) {
                String string3 = Integer.toString(i10);
                w13 w13Var3 = (w13) arrayList2.get(i10);
                Bundle bundle11 = new Bundle();
                IconCompat iconCompat2 = w13Var3.f33024b;
                if (iconCompat2 != null || (i3 = w13Var3.f33026d) == 0) {
                    iconCompat = iconCompat2;
                } else {
                    IconCompat iconCompatM3055a3 = IconCompat.m3055a(i3);
                    w13Var3.f33024b = iconCompatM3055a3;
                    iconCompat = iconCompatM3055a3;
                }
                Bundle bundle12 = w13Var3.f33023a;
                int i11 = i10;
                bundle11.putInt("icon", iconCompat != null ? iconCompat.m3056b() : 0);
                bundle11.putCharSequence("title", w13Var3.f33027e);
                bundle11.putParcelable("actionIntent", w13Var3.f33028f);
                Bundle bundle13 = bundle12 != null ? new Bundle(bundle12) : new Bundle();
                bundle13.putBoolean("android.support.allowGeneratedReplies", w13Var3.f33025c);
                bundle11.putBundle("extras", bundle13);
                bundle11.putParcelableArray("remoteInputs", null);
                bundle11.putBoolean("showsUserInterface", true);
                bundle11.putInt("semanticAction", 0);
                bundle10.putBundle(string3, bundle11);
                i10 = i11 + 1;
                arrayList2 = arrayList2;
            }
            bundle8.putBundle("invisible_actions", bundle10);
            bundle9.putBundle("invisible_actions", bundle10);
            Bundle bundle14 = x13Var.f33921i;
            if (bundle14 == null) {
                bundle14 = new Bundle();
                x13Var.f33921i = bundle14;
            }
            bundle14.putBundle("android.car.EXTENSIONS", bundle8);
            bundle3.putBundle("android.car.EXTENSIONS", bundle9);
        }
        builder.setExtras(x13Var.f33921i);
        builder.setRemoteInputHistory(null);
        builder.setBadgeIconType(0);
        builder.setSettingsText(null);
        builder.setShortcutId(null);
        builder.setTimeoutAfter(0L);
        builder.setGroupAlertBehavior(0);
        if (!TextUtils.isEmpty(x13Var.f33922j)) {
            builder.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
        }
        Iterator it = x13Var.f33913a.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            xy4.m12778e();
            return;
        }
        builder.setAllowSystemGeneratedContextualActions(x13Var.f33923k);
        builder.setBubbleMetadata(null);
        if (Build.VERSION.SDK_INT >= 36) {
            AbstractC1168t3.m10967e(builder);
        }
        nh3 nh3Var2 = x13Var.f33919g;
        if (nh3Var2 != null) {
            new Notification.BigTextStyle(builder).setBigContentTitle(null).bigText((CharSequence) nh3Var2.f25811c);
        }
        Notification notificationBuild = builder.build();
        if (nh3Var2 != null) {
            x13Var.f33919g.getClass();
        }
        if (nh3Var2 != null && (bundle = notificationBuild.extras) != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", "androidx.core.app.NotificationCompat$BigTextStyle");
        }
        if (i == 1 || i == 2 || i == 3) {
            yt1.f35517a.set(false);
            i2 = 10436;
        } else {
            i2 = 39789;
        }
        notificationManager.notify(i2, notificationBuild);
    }
}
