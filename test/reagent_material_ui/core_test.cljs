(ns reagent-material-ui.core-test
  (:refer-clojure :exclude [List])
  (:require [cljs.test :refer-macros [deftest is are testing run-tests]]
            [reagent-material-ui.core :refer [AppBar
                                              AppCanvas
                                              AutoComplete
                                              Avatar
                                              Badge
                                              BeforeAfterWrapper
                                              Card
                                              CardActions
                                              CardExpandable
                                              CardHeader
                                              CardMedia
                                              CardText
                                              CardTitle
                                              Checkbox
                                              CircularProgress
                                              ClearFix
                                              DatePicker
                                              DatePickerDialog
                                              Dialog
                                              Divider
                                              DropDownMenu
                                              EnhancedButton
                                              FlatButton
                                              FloatingActionButton
                                              FontIcon
                                              GridList
                                              GridTile
                                              IconButton
                                              IconMenu
                                              LeftNav
                                              LinearProgress
                                              ListItem
                                              Menu
                                              MenuItem
                                              Mixins
                                              Overlay
                                              Paper
                                              Popover
                                              RadioButton
                                              RadioButtonGroup
                                              RaisedButton
                                              RefreshIndicator
                                              Ripples
                                              SelectField
                                              SelectableContainerEnhance
                                              Slider
                                              SvgIcon
                                              Styles
                                              Snackbar
                                              Tab
                                              Tabs
                                              Table
                                              TableBody
                                              TableFooter
                                              TableHeader
                                              TableHeaderColumn
                                              TableRow
                                              TableRowColumn
                                              Toggle
                                              TimePicker
                                              TextField
                                              Toolbar
                                              ToolbarGroup
                                              ToolbarSeparator
                                              ToolbarTitle
                                              Tooltip
                                              Utils
                                              
                                              ;;
                                              List
                                              ]]
            [reagent.impl.component :refer [reagent-class?]]))

(deftest components
  (testing "Components should exist")
  (are [component] ((complement nil?) component)
       AppBar
       AppCanvas
       AutoComplete
       Avatar
       Badge
       BeforeAfterWrapper
       Card
       CardActions
       CardExpandable
       CardHeader
       CardMedia
       CardText
       CardTitle
       Checkbox
       CircularProgress
       ClearFix
       DatePicker
       DatePickerDialog
       Dialog
       Divider
       DropDownMenu
       EnhancedButton
       FlatButton
       FloatingActionButton
       FontIcon
       GridList
       GridTile
       IconButton
       IconMenu
       LeftNav
       LinearProgress
       ListItem
       Menu
       MenuItem
       Mixins
       Overlay
       Paper
       Popover
       RadioButton
       RadioButtonGroup
       RaisedButton
       RefreshIndicator
       Ripples
       SelectField
       SelectableContainerEnhance
       Slider
       SvgIcon
       Styles
       Snackbar
       Tab
       Tabs
       Table
       TableBody
       TableFooter
       TableHeader
       TableHeaderColumn
       TableRow
       TableRowColumn
       Toggle
       TimePicker
       TextField
       Toolbar
       ToolbarGroup
       ToolbarSeparator
       ToolbarTitle
       Tooltip
       Utils

       ;;
       List
       ;; Stepper
       ))


