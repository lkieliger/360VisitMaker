package textgen;

/**
 * 360VisitMaker - LKieliger on 07.02.2017.
 */


public class Templates {
    public final static String SCENE_PLACEHOLDER = "[! SCENE PLACEHOLDER !]";
    public final static String VRSHORTCUTS_PLACEHOLDER = "[! VR SHORTCUTS PLACEHOLDER !]";

    public final static String JAVASCRIPT_TEMPLATE = "/*\n" +
            " * Copyright 2016 Google Inc. All Rights Reserved.\n" +
            " * Licensed under the Apache License, Version 2.0 (the \"License\");\n" +
            " * you may not use this file except in compliance with the License.\n" +
            " * You may obtain a copy of the License at\n" +
            " *\n" +
            " *     http://www.apache.org/licenses/LICENSE-2.0\n" +
            " *\n" +
            " * Unless required by applicable law or agreed to in writing, software\n" +
            " * distributed under the License is distributed on an \"AS IS\" BASIS,\n" +
            " * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.\n" +
            " * See the License for the specific language governing permissions and\n" +
            " * limitations under the License.\n" +
            " */\n" +
            " var vrView;\n" +
            "\n" +
            SCENE_PLACEHOLDER +
            "\n" +
            "function onLoad() {\n" +
            "\tvrView = new VRView.Player('#vrview', {\n" +
            "\t\timage: 'blank.png',\n" +
            "\t\tpreview: 'blank.png',\n" +
            "\t\tis_stereo: true,\n" +
            "\t\tis_autopan_off: true\n" +
            "\t});\n" +
            "\n" +
            "\tvrView.on('ready', onVRViewReady);\n" +
            "\tvrView.on('modechange', onModeChange);\n" +
            "\tvrView.on('click', onHotspotClick);\n" +
            "\tvrView.on('error', onVRViewError);\n" +
            "\n" +
            "\tcreateNavigationShortcuts();\n" +
            "}\n" +
            "\n" +
            "function onVRViewReady(e) {\n" +
            "\tconsole.log('onVRViewReady');\n" +
            "\tloadScene('ini');\n" +
            "}\n" +
            "\n" +
            "function onModeChange(e) {\n" +
            "\tconsole.log('onModeChange', e.mode);\n" +
            "}\n" +
            "\n" +
            "function onHotspotClick(e) {\n" +
            "\tconsole.log('onHotspotClick', e.id);\n" +
            "\tif (e.id) {\n" +
            "\t\tloadScene(e.id);\n" +
            "\t}\n" +
            "}\n" +
            "\n" +
            "function createNavigationShortcuts(){\n" +
            "\tvar vrShortcuts = document.getElementById(\"vrshortcuts\");\n" +
            "\n" +
            VRSHORTCUTS_PLACEHOLDER +
            "\n" +
            "}\n" +
            "\n" +
            "function loadScene(id) {\n" +
            "\tconsole.log('loadScene', id);\n" +
            "\n" +
            "  // Set the image\n" +
            "  vrView.setContent({\n" +
            "  \timage: scenes[id].image,\n" +
            "  \tpreview: scenes[id].preview,\n" +
            "  \tis_stereo: false,\n" +
            "  \tis_autopan_off: true,\n" +
            "  \tdefault_yaw: 180\n" +
            "  });\n" +
            "\n" +
            "  // Add all the hotspots for the scene\n" +
            "  var newScene = scenes[id];\n" +
            "  var sceneHotspots = Object.keys(newScene.hotspots);\n" +
            "  for (var i = 0; i < sceneHotspots.length; i++) {\n" +
            "  \tvar hotspotKey = sceneHotspots[i];\n" +
            "  \tvar hotspot = newScene.hotspots[hotspotKey];\n" +
            "\n" +
            "  \tvrView.addHotspot(hotspotKey, {\n" +
            "  \t\tpitch: hotspot.pitch,\n" +
            "  \t\tyaw: hotspot.yaw,\n" +
            "  \t\tradius: hotspot.radius,\n" +
            "  \t\tdistance: hotspot.distance\n" +
            "  \t});\n" +
            "  }\n" +
            "}\n" +
            "\n" +
            "function onVRViewError(e) {\n" +
            "\tconsole.log('Error! %s', e.message);\n" +
            "}\n" +
            "\n" +
            "window.addEventListener('load', onLoad);\n";
}
